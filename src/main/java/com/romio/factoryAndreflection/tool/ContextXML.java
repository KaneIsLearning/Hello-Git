package com.romio.factoryAndreflection.tool;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈XML解析工具类〉
 *
 * @author Kane
 * Date:   2019/5/7 15:16
 * @since 1.0.0
 */
public class ContextXML {
    /**
     * 存储工厂特征-工厂类名map.
     */
    private static Map<String,String> factoryMap = new HashMap<>();
    static{
        initFactoryMapping();
    }
    private static void initFactoryMapping(){
        factoryMap.put("old","factoryAndreflection.factory.YoungFactory");
        factoryMap.put("young","factoryAndreflection.factory.OldFactory");
    }

    /**
     * 根据特征找到合适的工厂
     * @param desc 特征描述
     * @return 工厂类名
     */
    public static String getFactory(String desc){
        return factoryMap.get(desc);
    }


}