package bridgeparttern;

public abstract class Animal {
    protected Color color;

    protected Animal(Color color) {
        this.color = color;
    }

    abstract void show();

}
