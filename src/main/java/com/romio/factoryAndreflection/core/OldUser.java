package com.romio.factoryAndreflection.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈年式用户〉
 *
 * @author Kane
 * Date:   2019/5/7 14:43
 * @since 1.0.0
 */
public class OldUser implements IUser{

    @Override
    public void Insert(IUser user) {
        System.out.println("老式方式向用户表插入一个用户");
    }

    @Override
    public IUser getUser(int id) {
        System.out.println("老式方式从用户表查询到一个用户");
        return null;
    }
}