package bridgeparttern;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog(new Grey());
        dog1.show();
        Dog dog2 = new Dog(new Orange());
        dog2.show();

        Cat cat1 = new Cat(new Grey());
        cat1.show();
    }

}
