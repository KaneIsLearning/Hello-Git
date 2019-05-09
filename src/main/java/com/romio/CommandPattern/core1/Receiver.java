package com.romio.CommandPattern.core1;

import com.romio.CommandPattern.core.Command;
import com.romio.CommandPattern.core2.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈命令接收者〉
 *
 * @author Kane
 * Date:   2019/5/9 14:32
 * @since 1.0 */
public class Receiver {
    private int id;
    private String name;
    public Receiver(){

    }
    public Receiver(String name){
        this.name = name;
    }
    public void action(Order order){
        order.setState(1);
        List<Command> commands = order.getCommands();
        System.out.println("开始制作订单"+order.getId()+"号的商品");
        for (Command com:commands
             ) {
            com.execute();
        }
        System.out.println("结束制作订单"+order.getId()+"号的商品");
        order.setState(2);
    }



}