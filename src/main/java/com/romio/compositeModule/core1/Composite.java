package com.romio.compositeModule.core1;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈定义节点行为，存储子部件〉
 *
 * @author Kane
 * Date:   2019/5/8 15:59
 * @since 1.0.0
 */
public class Composite extends Component{
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(depth--+":普通节点"+name);

        for (Component c:children
             ) {
            c.display(depth);
        }
    }
}