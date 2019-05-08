package com.romio.factoryAndreflection.factory;

import com.romio.factoryAndreflection.core.IUser;
import com.romio.factoryAndreflection.core.OldUser;

/**
 * 〈一句话功能简述〉<br>
 * 〈老式工厂〉
 *
 * @author Kane
 * Date:   2019/5/7 15:09
 * @since 1.0.0
 */
public class OldFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new OldUser();
    }
}