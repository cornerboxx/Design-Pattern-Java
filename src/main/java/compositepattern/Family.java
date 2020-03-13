package compositepattern;

public abstract class Family {

    protected String name;

    protected Family(String name) {
        this.name = name;
    }

    abstract void add(Family family);

    void show(int spaceNum){
        for (int i = 0; i < spaceNum; i++) {
            System.out.print(" ");
        }
        System.out.println(name);
    };

    void show(){
        show(0);
    };

}
