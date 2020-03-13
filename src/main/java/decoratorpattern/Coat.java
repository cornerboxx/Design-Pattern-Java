package decoratorpattern;

public class Coat implements Clothes {
    public Coat() {

    }

    @Override
    public void wear() {
        System.out.println("穿上外套");
    }
}
