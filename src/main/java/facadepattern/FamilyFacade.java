package facadepattern;

public class FamilyFacade {

    void buildFamily(){
        Dog dog = new Dog();
        dog.getDog();
        Cat cat = new Cat();
        cat.getCat();
        Man man = new Man();
        man.getMan();
        System.out.println("组成一个家");
    }

}
