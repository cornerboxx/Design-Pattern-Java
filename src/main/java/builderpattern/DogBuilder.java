package builderpattern;

public class DogBuilder implements AnimalBuilder {

    @Override
    public String father() {
        return " 一只dog ";
    }

    @Override
    public String mather() {
        return "另一只dog";
    }

    @Override
    public String meet() {
        return "相遇了";
    }

    @Override
    public Animal build() {
        Animal animal = new Animal();
        animal.setGender(Math.random() - 0.5 < 0 ? "male" : "female");
        animal.setType("dog");
        return animal;
    }
}
