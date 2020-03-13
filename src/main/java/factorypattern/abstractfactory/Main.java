package factorypattern.abstractfactory;

public class Main {

    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        dogFactory.produceMaleAnimal().show();
        dogFactory.produceFemaleAnimal().show();

        CatFactory catFactory = new CatFactory();
        catFactory.produceMaleAnimal().show();
        catFactory.produceFemaleAnimal().show();

    }

}
