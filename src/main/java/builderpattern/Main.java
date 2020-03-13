package builderpattern;

public class Main {

    public static void main(String[] args) {
        DogBuilder dogBuilder = new DogBuilder();
        CatBuilder catBuilder = new CatBuilder();


        Director director = new Director(dogBuilder);
        director.buildAnimal().show();

        director = new Director(catBuilder);
        director.buildAnimal().show();
    }

}
