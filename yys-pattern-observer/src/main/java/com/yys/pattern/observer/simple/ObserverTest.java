package com.yys.pattern.observer.simple;

/**
 * 观察者模式
 *      Test
 * @author yys
 */
public class ObserverTest {

    public static void main(String[] args) {

        GPer gper = GPer.getInstance();
        Teacher teacher1 = new Teacher("马哥");
        Teacher teacher2 = new Teacher("小马哥");

        gper.addObserver(teacher1);
        gper.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("马仔");
        question.setContent("观察者模式适用于哪些场景？");

        gper.publishQuestion(question);
    }

}
