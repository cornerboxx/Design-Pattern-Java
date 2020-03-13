package adapterpattern.classadapter;


public class Cat2ToycatAdapter extends ToyCat implements Cat {
    @Override
    public void getCat() {
        getToyCat();
    }
}
