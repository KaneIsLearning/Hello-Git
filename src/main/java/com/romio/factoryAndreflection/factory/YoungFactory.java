package com.romio.factoryAndreflection.factory;


import com.romio.factoryAndreflection.core.IUser;
import com.romio.factoryAndreflection.core.YoungUser;

/**
 * 〈一句话功能简述〉<br>
 *  〈年轻工厂〉
 *
 * @author Kane
 * Date:   2019/5/7 15:04
 * @since 1.0.0
 */
public class YoungFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new YoungUser();
    }
}