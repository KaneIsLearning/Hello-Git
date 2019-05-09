package com.romio.CommandPattern.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈command〉
 *
 * @author Kane
 * Date:   2019/5/9 14:11
 * @since 1.0.0
 */
public abstract class Command {
    protected int id;
    protected String name;
    protected int size;
    protected int state = 0;//状态：0：订单初始状态，命令未执行；1：命令执行中； 2：命令已执行

    public Command(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Command(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Command() {
    }

    public abstract void execute();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}