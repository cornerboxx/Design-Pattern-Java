package factorypattern.abstractfactory;

public class MaleDog extends Animal {

    public MaleDog() {
        super.setGender("male");
        super.setName("dog");
    }

    @Override
    public void show() {
        System.out.println(super.getGender() + " " + super.getName());
    }

}
