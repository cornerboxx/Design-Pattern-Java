package factorypattern.factory;

public class Main {

    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        dogFactory.produceAnimal().show();

        CatFactory catFactory = new CatFactory();
        catFactory.produceAnimal().show();
    }

}
