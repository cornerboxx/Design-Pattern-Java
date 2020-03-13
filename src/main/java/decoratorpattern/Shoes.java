package decoratorpattern;

public class Shoes implements Clothes {
    public Shoes(Clothes clothes) {
        this.clothes = clothes;
    }

    private Clothes clothes;

    @Override
    public void wear() {
        clothes.wear();
        System.out.println("穿上鞋子");
    }
}
