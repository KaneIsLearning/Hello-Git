package com.romio.mementoModule.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈test〉
 *
 * @author Kane
 * Date:   2019/5/8 14:38
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        //模拟发起者从初始状态到运动状态到死亡状态，再到保存点，利用备忘录模式
        Originator ori = new Originator();
        String string = new String("ddd");
        ori.show();
        ori.setState("运动状态！来到保存点。");
        ori.show();
        Memento m = ori.createMemento();
        ori.setState("死亡状态！");
        ori.show();
        ori.setMemento(m);
        ori.show();

    }

}