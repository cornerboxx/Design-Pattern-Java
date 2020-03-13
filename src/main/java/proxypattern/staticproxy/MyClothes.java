package proxypattern.staticproxy;

public class MyClothes implements Clothes{

    @Override
    public void wear() {
        System.out.println("穿上衣服");
        System.out.println("穿上裤子");
        System.out.println("穿上鞋子");
    }
}
