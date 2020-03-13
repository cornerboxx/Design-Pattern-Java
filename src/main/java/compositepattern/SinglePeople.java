package compositepattern;

public class SinglePeople extends  Family {

    protected SinglePeople(String name) {
        super(name);
    }

    @Override
    protected void add(Family family) {
        throw new RuntimeException("单身狗没有后代");
    }

}
