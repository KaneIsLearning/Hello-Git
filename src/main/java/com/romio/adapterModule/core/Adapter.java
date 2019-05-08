package com.romio.adapterModule.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈适配器，完成特需接口到普通接口的转换〉
 *
 * @author Kane
 * Date:   2019/5/8 8:46
 * @since 1.0.0
 */
public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
       adaptee.specialRequest();
    }
}