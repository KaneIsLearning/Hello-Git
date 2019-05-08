package com.romio.compositeModule.core1;

import java.security.PublicKey;

/**
 * 〈一句话功能简述〉<br>
 * 〈xx〉
 *
 * @author Kane
 * Date:   2019/5/8 16:08
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Composite composite = new Composite("root");
        composite.add(new Leaf("枫叶"));
        composite.add(new Leaf("梧桐叶"));
        Composite composite1 = new Composite("强壮的枝干");
        composite1.add(new Leaf("柳叶"));
        composite1.add(new Leaf("槐叶"));
        Composite composite2 = new Composite("弱小的枝干");
        composite2.add(new Leaf("樟树叶"));
        composite.add(composite1);
        composite.add(composite2);
        //结构展示
        composite.display(5);


    }

}