package factorypattern.easyfactory;

public class Main {

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.produceAnimal("dog");
        dog.show();

        Animal cat = factory.produceAnimal("cat");
        cat.show();

    }

}
