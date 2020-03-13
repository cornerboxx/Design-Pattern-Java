package bridgeparttern;

public class Cat extends Animal {

    public Cat(Color color) {
        super(color);
    }

    @Override
    void show() {
        System.out.print("得到一只");
        color.showColor();
        System.out.println("的猫");
    }
}
