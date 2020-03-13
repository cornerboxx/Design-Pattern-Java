package prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Animal implements Cloneable {

    String name;
    String gender;

    public void show() {
        System.out.println(name + " " + gender);
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

    /**
     * 可以为多个实例编写一个抽象接口
     * 将多个原型保存在一个hashtable中，暴露一个对外方法提供对应的原型
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        int i = 0;
        List<Animal> list = new ArrayList<>();
        while (i < 3) {
            try {
                Animal clone = animal.clone();
                clone.name = "dog" + i;
                clone.gender = i + "";
                list.add(clone);

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            i++;
        }

        list.forEach(s -> {
            if (s != null) {
                s.show();
            }
        });
    }

}
