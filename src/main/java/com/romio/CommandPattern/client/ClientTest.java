package com.romio.CommandPattern.client;

import com.romio.CommandPattern.core.Command;
import com.romio.CommandPattern.core.CommandImp;
import com.romio.CommandPattern.core1.Invoker;
import com.romio.CommandPattern.core1.Receiver;
import com.romio.CommandPattern.core2.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈xx〉
 *
 * @author Kane
 * Date:   2019/5/9 15:00
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) {
        /**
         * 流程：客户点单-》前台（判断）生成订单，通知厨房-》厨房执行订单。
         */
        Receiver receiver = new Receiver("厨房");
        Invoker invoker = new Invoker(1,"前台管理员");
        List<Command> commands = new ArrayList<>();
        Command command = new CommandImp("烤地瓜",5);
        Command command1 = new CommandImp("番茄",10);
        commands.add(command);
        commands.add(command1);
        Order order = invoker.createOrder(101,commands);
        invoker.notify(order,receiver);

    }

}