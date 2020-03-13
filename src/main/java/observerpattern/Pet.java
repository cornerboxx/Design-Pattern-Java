package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private List<People> peopleList = new ArrayList<>();

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyPeople();
    }

    public void attachPeople(People people){
        peopleList.add(people);
    }

    public void notifyPeople(){
        peopleList.forEach(
                s -> s.chickState(state)
        );
    }


}
