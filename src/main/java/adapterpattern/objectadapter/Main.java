package adapterpattern.objectadapter;

public class Main {

    public static void main(String[] args) {
        Cat2ToycatAdapter adapter = new Cat2ToycatAdapter();
        adapter.getCat();
    }
    
}
