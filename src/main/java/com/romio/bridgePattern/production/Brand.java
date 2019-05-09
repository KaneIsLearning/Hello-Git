package com.romio.bridgePattern.production;

import com.romio.bridgePattern.core.Implementor;

/**
 * 〈一句话功能简述〉<br>
 * 〈品牌〉
 *
 * @author Kane
 * Date:   2019/5/9 10:32
 * @since 1.0.0
 */
public class Brand {
    protected String name;
    protected Implementor implementor;
    public Brand(){

    }
    public Brand(String name){
        this.name = name;
    }
    public void operation(){
        System.out.print(name+"品牌手机:");
        implementor.operation();
    }
    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}