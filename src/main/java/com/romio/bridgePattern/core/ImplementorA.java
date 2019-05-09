package com.romio.bridgePattern.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈派生类A〉
 *
 * @author Kane
 * Date:   2019/5/9 10:27
 * @since 1.0.0
 */
public class ImplementorA extends Implementor{

    @Override
    public void operation() {
        System.out.println("具体软件A的方法执行");
    }

}