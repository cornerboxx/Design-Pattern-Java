package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class PetShop {

    private List<Pet> pets = new ArrayList<Pet>();

    public void add(Pet pet){
        pets.add(pet);
    }

    public Itr getIterator(){
        return new Itr();
    }

    private class Itr implements MyIterator<Pet>{
        int index;

        @Override
        public boolean hasNext() {
            if(pets==null||pets.size()<=0){
                return false;
            }
            if(index == pets.size()){
                return false;
            }
            return true;
        }

        @Override
        public Pet next() {
            if(hasNext()){
                return pets.get(index++);
            }
            return null;
        }
    }

}
