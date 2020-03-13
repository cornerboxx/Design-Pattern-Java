package proxypattern.staticproxy;

public class Main {

    public static void main(String[] args) {
        MyClothes myClothes = new MyClothes();
        MyClothesProxy proxy = new MyClothesProxy(myClothes);
        proxy.wear();
    }

}
