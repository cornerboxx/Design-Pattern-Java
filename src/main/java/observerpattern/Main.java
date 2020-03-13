package observerpattern;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.attachPeople(new Owner());
        pet.attachPeople(new Veterinary());

        pet.setState("healthy");
        pet.setState("sick");

    }

}
