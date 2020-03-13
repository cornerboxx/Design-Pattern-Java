package decoratorpattern;

public class Pants implements Clothes {
    public Pants(Clothes clothes) {
        this.clothes = clothes;
    }

    private Clothes clothes;

    @Override
    public void wear() {
        clothes.wear();
        System.out.println("穿上裤子");
    }
}
