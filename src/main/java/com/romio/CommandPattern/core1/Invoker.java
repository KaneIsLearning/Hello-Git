package com.romio.CommandPattern.core1;

import com.romio.CommandPattern.core.Command;
import com.romio.CommandPattern.core2.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈调度者〉
 *
 * @author Kane
 * Date:   2019/5/9 14:29
 * @since 1.0.0
 */
public class Invoker {
    private int id;
    private String name;

    public Invoker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Invoker() {
    }

    /**
     * 管理者制造订单
     * @param id
     * @param commands
     * @return
     */
    public Order createOrder(int id,List<Command> commands){
        return new Order(id,commands);
    }
    /**
     *
     * 管理者判断订单满足与否，并通知后台执行订单操作。
     * @param order
     * @param receiver
     */
    public void notify(Order order,Receiver receiver){
        if(check(order)){
            System.out.println("商品满足");
            receiver.action(order);
        }

    }
    /**
     * 管理者去判断订单是否满足
     * @param order
     * @return
     */
    private boolean check(Order order){
        List<Command> commands = order.getCommands();
        for (Command  command:commands
             ) {
            if(command.getSize()>10){
                System.out.println("商品"+command.getName()+"供货不足，请少点一些！");
                return false;
            }
        }
        return true;
    }

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
}