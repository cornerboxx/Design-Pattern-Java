package factorypattern.abstractfactory;

public class MaleCat extends Animal {

    public MaleCat() {
        super.setGender("male");
        super.setName("cat");
    }

    @Override
    public void show() {
        System.out.println(super.getGender() + " " + super.getName());
    }

}
