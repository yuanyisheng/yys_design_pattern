package com.yys.pattern.prototype.deep;

import lombok.Data;

import java.io.*;

/**
 * 深克隆(被克隆对象)
 *      齐天大圣类
 * @author yys
 */
@Data
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    private JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.jinGuBang = new JinGuBang();
    }

    // 浅克隆方式
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    // 深克隆方法
    public Object deepClone() {
        try {

            // write
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // read
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng clone = (QiTianDaSheng) ois.readObject();

            // close stream
            bos.close();
            oos.close();
            bis.close();
            ois.close();

            // return
            return clone;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
