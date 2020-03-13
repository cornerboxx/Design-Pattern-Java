package iteratorpattern;

public class Main {

        public static void main(String[] args){
            PetShop shop = new PetShop();
            shop.add(new Pet("小黄"));
            shop.add(new Pet("小菊"));
            shop.add(new Pet("旺财"));
            MyIterator<Pet> it = shop.getIterator();
            while(it.hasNext()){
                String str = it.next().getName();
                System.out.println(str);
            }
        }

}
