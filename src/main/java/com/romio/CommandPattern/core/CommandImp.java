package com.romio.CommandPattern.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈命令实现类〉
 *
 * @author Kane
 * Date:   2019/5/9 14:15
 * @since 1.0.0
 */
public class CommandImp extends Command{

    @Override
    public void execute() {
        System.out.println("制作"+name+" "+size+"份");
    }

    public CommandImp(int id, String name) {
        super(id, name);
    }

    public CommandImp(String name, int size) {
        super(name, size);
    }

    public CommandImp() {
    }
}