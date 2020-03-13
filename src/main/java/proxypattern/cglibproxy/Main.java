package proxypattern.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(MyClothes.class);
        enhancer.setCallback(new MyClothesProxy());
        MyClothes myClothes=(MyClothes)enhancer.create();
        myClothes.wear();
    }

}
