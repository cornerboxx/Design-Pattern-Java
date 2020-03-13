package factorypattern.abstractfactory;

public abstract class Animal {

    private String gender;
    private String name;


    public String getGender() {
        return gender;
    }

    protected void setGender(final String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    protected void setName(final String name) {
        this.name = name;
    }

    public abstract void show();

}
