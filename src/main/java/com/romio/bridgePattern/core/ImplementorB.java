package com.romio.bridgePattern.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈派生类〉
 *
 * @author Kane
 * Date:   2019/5/9 10:28
 * @since 1.0.0
 */
public class ImplementorB extends Implementor{

    @Override
    public void operation() {
        System.out.println("具体软件B的方法执行");
    }
}