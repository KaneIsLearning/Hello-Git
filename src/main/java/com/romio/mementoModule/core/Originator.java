package com.romio.mementoModule.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈备忘录发起对象〉
 *
 * @author Kane
 * Date:   2019/5/8 14:28
 * @since 1.0.0
 */
public class Originator {
    private String state;
    public Originator(){
        state = "初始状态";
    }
    public Memento createMemento(){
        return new Memento(state);
    }
    public void setMemento(Memento memento){
        state = memento.getState();
    }
    public void show(){
        System.out.println("发起对象此时状态："+state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}