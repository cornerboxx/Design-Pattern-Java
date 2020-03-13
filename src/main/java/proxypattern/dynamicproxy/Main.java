package proxypattern.dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        Clothes clothes = (Clothes) Proxy.newProxyInstance(
                MyClothes.class.getClassLoader(), MyClothes.class.getInterfaces(),
                new MyClothesProxy(new MyClothes()));
        clothes.wear();

    }

}
