package com.yys.pattern.proxy.dynamicproxy.yysproxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class YYSProxy {

    private final static String Ln = "\r\n";

    private static Map<Class, Class> mappings = new HashMap<Class, Class>();

    static {
        mappings.put(int.class, Integer.class);
    }

    public static Object newProxyInstance(YYSClassLoader classLoader, Class<?>[] interfaces, YYSInvocationHandler h) {

        try {

            // 1、动态生成源代码 .java文件
            String src = generateSrc(interfaces);
            System.out.println(src);

            // 2、将 .java文件输出到磁盘
            Class<YYSProxy> yysProxyClass = YYSProxy.class;
            URL resource = yysProxyClass.getResource("");
            String filePath = resource.getPath();
            System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            // 3、把生成的 .java文件编程成 .class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            // 4、编译生成的 .class文件加载到 JVM中
            Class<?> proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(YYSInvocationHandler.class);
            f.delete();

            // 5、返回字节码重组后新的代理对象
            return c.newInstance(h);

        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.yys.pattern.proxy.dynamicproxy.yysproxy;" + Ln);
        sb.append("import com.yys.pattern.proxy.Person;" + Ln);
        sb.append("import java.lang.reflect.*;" + Ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + Ln);
        sb.append("YYSInvocationHandler h;" + Ln);
        sb.append("public $Proxy0() {" + Ln);
        sb.append("this.h = h;" + Ln);
        sb.append("}" + Ln);

        for (Method m : interfaces[0].getMethods()) {

            Class<?>[] params = m.getParameterTypes();

            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasss = new StringBuffer();

            for (int i = 0; i < params.length; i++) {
                Class<?> clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " + paramName);
                paramValues.append(paramName);
                paramClasss.append(clazz.getName() + ".class");
                if (i > 0 && i < params.length - 1) {
                    paramNames.append(",");
                    paramValues.append(",");
                    paramClasss.append(",");
                }
            }

            sb.append("public " + m.getReturnType() + " " + m.getName() + "(" + paramNames.toString() + ") {" + Ln);
            sb.append("try{ " + Ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{" + paramClasss.toString() + "});" + Ln);
            sb.append((hasReturnValue(m.getReturnType()) ? "return " : "") + getCaseCode("this.h.invoke(this, m, new Object[]{" + paramValues + "})", m.getReturnType()) + ";" + Ln);
            sb.append("} catch(Error _ex) {" + Ln);
            sb.append("} catch(Throwable e) {" + Ln);
            sb.append("throw new UndeclaredThrowableException(e);" + Ln);
            sb.append("}" + Ln);
            sb.append(getReturnEmptyCode(m.getReturnType()));
            sb.append("}" + Ln);
        }
        sb.append("}" + Ln);

        return sb.toString();
    }


    private static String toLowerFirstCase(String src) {
        char[] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

    private static boolean hasReturnValue(Class<?> clazz) {
        return clazz != void.class;
    }

    private static String getCaseCode(String code, Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "((" + mappings.get(returnClass).getName() + ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static String getReturnEmptyCode(Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "return 0;";
        } else if (returnClass == void.class) {
            return "";
        } else {
            return "return null;";
        }
    }

}
