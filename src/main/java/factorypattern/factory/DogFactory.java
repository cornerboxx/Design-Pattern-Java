package factorypattern.factory;


import factorypattern.easyfactory.Animal;
import factorypattern.easyfactory.Dog;

public class DogFactory implements AnimalFactory{

    @Override
    public Animal produceAnimal() {
        return new Dog();
    }
}
