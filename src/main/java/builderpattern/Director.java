package builderpattern;

public class Director {
    private AnimalBuilder builder;

    public Director(AnimalBuilder builder) {
        this.builder = builder;
    }

    public Animal buildAnimal() {
        System.out.println(builder.father());
        System.out.println(builder.mather());
        System.out.println(builder.meet());
        return builder.build();
    }

}
