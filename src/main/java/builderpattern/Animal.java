package builderpattern;

public class Animal {

    private String name;

    private String gender;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void show() {
        System.out.println("这是一只名叫" + name + "的" + type + "性别为" + gender);
    }

}
