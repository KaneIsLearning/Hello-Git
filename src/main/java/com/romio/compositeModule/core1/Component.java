package com.romio.compositeModule.core1;

import javax.naming.Name;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈对象声明接口〉
 *
 * @author Kane
 * Date:   2019/5/8 15:27
 * @since 1.0.0
 */
public abstract class Component {
    protected String name;
    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);

}