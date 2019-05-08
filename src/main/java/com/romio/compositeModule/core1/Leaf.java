package com.romio.compositeModule.core1;

/**
 * 〈一句话功能简述〉<br>
 * 〈子节点对象〉
 *
 * @author Kane
 * Date:   2019/5/8 15:33
 * @since 1.0.0
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("叶子无法添加分支");
    }

    @Override
    public void remove(Component c) {
        System.out.println("叶子无子节点可删");
    }

    @Override
    public void display(int depth) {
        System.out.println(depth+":叶子节点"+name);

    }
}