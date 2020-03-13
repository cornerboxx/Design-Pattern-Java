package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Home extends Family {

    public Home(String name) {
        super(name);
    }

    private List<Family> familyList = new ArrayList<>();

    @Override
    protected void add(Family family) {
        familyList.add(family);
    }

    @Override
    void show(int spaceNum) {
        super.show(spaceNum);
        if (familyList != null && familyList.size() > 0) {
            spaceNum++;
            for (int i = 0; i < familyList.size(); i++) {
               familyList.get(i).show(spaceNum);
            }
        }
    }
}
