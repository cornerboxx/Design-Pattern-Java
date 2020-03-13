package factorypattern.abstractfactory;

public class DogFactory implements AnimalFactory {

    @Override
    public Animal produceMaleAnimal() {
        return new MaleDog();
    }

    @Override
    public Animal produceFemaleAnimal() {
        return new FemaleDog();
    }
}
