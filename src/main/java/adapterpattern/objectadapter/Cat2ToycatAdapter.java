package adapterpattern.objectadapter;


public class Cat2ToycatAdapter implements Cat {
    private ToyCat toyCat = new ToyCat();

    @Override
    public void getCat() {
        toyCat.getToyCat();
    }
}
