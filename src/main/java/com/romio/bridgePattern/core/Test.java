package com.romio.bridgePattern.core;

import com.romio.bridgePattern.production.Brand;
import com.romio.bridgePattern.production.RefinedBrand;

/**
 * 〈一句话功能简述〉<br>
 * 〈t〉
 *
 * @author Kane
 * Date:   2019/5/9 10:37
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Brand brand = new RefinedBrand("三星");
        brand.setImplementor(new ImplementorA());
        brand.operation();
        brand.setImplementor(new ImplementorB());
        brand.operation();

    }

}