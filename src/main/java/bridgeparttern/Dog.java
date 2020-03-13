package bridgeparttern;

public class Dog extends Animal {

    public Dog(Color color) {
        super(color);
    }

    @Override
    void show() {
        System.out.print("得到一只");
        color.showColor();
        System.out.println("的狗");
    }
}
