package factorypattern.abstractfactory;

public class FemaleCat extends Animal {

    public FemaleCat() {
        super.setGender("female");
        super.setName("cat");
    }

    @Override
    public void show() {
        System.out.println(super.getGender() + " " + super.getName());
    }

}
