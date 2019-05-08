package com.romio.factoryAndreflection.core;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户表接口〉
 *
 * @author dell
 * @create 2019/5/7
 * @since 1.0.0
 */
public interface IUser {
    void Insert(IUser user);
    IUser getUser(int id);
}
