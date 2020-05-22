package com.yys.pattern.prototype.deep;

/**
 * 深克隆
 *      Test
 * @author yys
 */
public class CloneTest {

    public static void main(String[] args) {
        try {

            // 创建被克隆对象
            QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

            // start clone - deep clone
            QiTianDaSheng deepCloneQiTianDaSheng = (QiTianDaSheng) qiTianDaSheng.deepClone();
            // start clone - shallow clone
            QiTianDaSheng shallowCloneQiTianDaSheng = (QiTianDaSheng) qiTianDaSheng.clone();

            // deep clone start compare
            System.out.println("\n深克隆：" + (qiTianDaSheng.getJinGuBang() == deepCloneQiTianDaSheng.getJinGuBang()));
            System.out.println("\n浅克隆：" + (qiTianDaSheng.getJinGuBang() == shallowCloneQiTianDaSheng.getJinGuBang()));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
