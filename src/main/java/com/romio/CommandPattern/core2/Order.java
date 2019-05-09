package com.romio.CommandPattern.core2;

import com.romio.CommandPattern.core.Command;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈订单〉
 *
 * @author Kane
 * Date:   2019/5/9 14:45
 * @since 1.0.0
 */
public class Order {
    private int id;
    private int state;//订单状态
    private List<Command> commands;

    public Order() {
    }

    public Order(List<Command> commands) {
        this.commands = commands;
    }

    public Order(int id, List<Command> commands) {
        this.id = id;
        this.commands = commands;
    }

    public Order(int id, int state, List<Command> commands) {
        this.id = id;
        this.state = state;
        this.commands = commands;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }
}