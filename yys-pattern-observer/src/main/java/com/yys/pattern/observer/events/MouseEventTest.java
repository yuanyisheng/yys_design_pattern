package com.yys.pattern.observer.events;

/**
 * 观察者模式
 *      Test
 * @author yys
 */
public class MouseEventTest {

    public static void main(String[] args) {

        // create mouse event callback
        MouseEventCallback callback = new MouseEventCallback();

        // 注册事件
        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_CLICK, callback);
        mouse.addLisenter(MouseEventType.ON_MOVE, callback);
        mouse.addLisenter(MouseEventType.ON_WHEEL, callback);
        mouse.addLisenter(MouseEventType.ON_OVER, callback);

        // 调用方法
        mouse.click();
        mouse.blur();

    }

}
