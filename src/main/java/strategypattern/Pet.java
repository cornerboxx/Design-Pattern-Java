package strategypattern;

public class Pet {

    private Animal animal;

    public Pet(Animal animal) {
        this.animal = animal;
    }

    void show(){
        animal.show();
    }
}
