package factorypattern.abstractfactory;

public class CatFactory implements AnimalFactory {

    @Override
    public Animal produceMaleAnimal() {
        return new MaleCat();
    }

    @Override
    public Animal produceFemaleAnimal() {
        return new FemaleCat();
    }
}
