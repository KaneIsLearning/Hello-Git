package com.romio.singleton.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈单例模式〉
 *
 * @author Kane
 * Date:   2019/5/8 17:10
 * @since 1.0.0
 */
public class SingletonDemo {
    private  static SingletonDemo INSTANCE = null;
    private SingletonDemo(){

    }
    public static SingletonDemo getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonDemo.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonDemo();
                }
            }
        }
        return INSTANCE;
    }

}