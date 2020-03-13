package factorypattern.easyfactory;

public class AnimalFactory {

    public Animal produceAnimal(String type) {
        Animal animal = null;
        switch (type) {
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
        }
        return animal;
    }

}
