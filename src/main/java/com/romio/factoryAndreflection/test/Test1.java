package com.romio.factoryAndreflection.test;


import com.romio.factoryAndreflection.core.IUser;
import com.romio.factoryAndreflection.factory.IFactory;
import com.romio.factoryAndreflection.tool.ContextXML;

/**
 * 〈一句话功能简述〉<br>
 * 〈ceshi〉
 *
 * @author Kane
 * Date:   2019/5/7 15:10
 * @since 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String desc = "old";
            Class c = Class.forName(ContextXML.getFactory(desc));
            IFactory factory = (IFactory)c.newInstance();
            IUser user = factory.createUser();
            user.getUser(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}