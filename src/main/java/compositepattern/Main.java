package compositepattern;

public class Main {

    public static void main(String[] args) {
        Home h1 = new Home("1家庭");

        Home h1_1 = new Home("1.1家庭");
        Home h1_1_1 = new Home("1.1.1家庭");
        h1_1.add(h1_1_1);
        h1_1.add(new SinglePeople("1.1.1单身狗"));

        h1.add(h1_1);
        h1.add(new SinglePeople("1.1单身狗"));

        Home h1_2 = new Home("1.2家庭");
        h1.add(h1_2);

        h1.show();
    }

}
