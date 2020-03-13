package singletonpattern.hangury;

public class Singleton1 {
    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static Singleton1 instance2 = new Singleton1();
    }

    public static Singleton1 inClass() {
        return Singleton1.SingletonHolder.instance2;
    }
    
}
