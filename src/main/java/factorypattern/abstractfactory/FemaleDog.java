package factorypattern.abstractfactory;

public class FemaleDog extends Animal {

    public FemaleDog() {
        super.setGender("female");
        super.setName("dog");
    }

    @Override
    public void show() {
        System.out.println(super.getGender() + " " + super.getName());
    }

}
