package factorypattern.factory;


import factorypattern.easyfactory.Animal;
import factorypattern.easyfactory.Cat;

public class CatFactory implements AnimalFactory{

    @Override
    public Animal produceAnimal() {
        return new Cat();
    }
}
