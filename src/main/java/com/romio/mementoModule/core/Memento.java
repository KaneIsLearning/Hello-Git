package com.romio.mementoModule.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈备忘录类〉
 *
 * @author Kane
 * Date:   2019/5/8 14:29
 * @since 1.0.0
 */
public class Memento {
    private String state;//状态

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}