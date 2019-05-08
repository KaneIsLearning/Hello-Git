package com.romio.singleton.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈xx〉
 *
 * @author Kane
 * Date:   2019/5/8 17:23
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        SingletonDemo demo1 = SingletonDemo.getInstance();
        SingletonDemo demo2 = SingletonDemo.getInstance();
        if(demo1 == demo2){
            System.out.println("单例模式创建成功");
        }
    }

}