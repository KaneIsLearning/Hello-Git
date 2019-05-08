package com.romio.factoryAndreflection.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈新式方法创建用户〉
 *
 * @author Kane
 * Date:   2019/5/7 14:45
 * @since 1.0.0
 */
public class YoungUser implements IUser{

    @Override
    public void Insert(IUser user) {
        System.out.println("新式方法给用户表添加一个用户");
    }

    @Override
    public IUser getUser(int id) {
        System.out.println("新式方法从用户表查询到一个用户");
        return null;
    }
}