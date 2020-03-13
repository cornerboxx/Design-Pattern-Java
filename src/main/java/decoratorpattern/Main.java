package decoratorpattern;

public class Main {

    public static void main(String[] args) {
        Clothes clothes = new Shoes(new Pants(new Coat()));
        clothes.wear();
    }

}
