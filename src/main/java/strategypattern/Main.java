package strategypattern;

public class Main {

    public static void main(String[] args) {
        Pet cat = new Pet(new Cat());
        cat.show();

        Pet dog = new Pet(new Dog());
        dog.show();
    }

}
