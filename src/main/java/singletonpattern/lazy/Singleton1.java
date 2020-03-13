package singletonpattern.lazy;

public class Singleton1 {
    private Singleton1() {

    }

    private static Singleton1 singleton1 = null;

    /**
     * 方法上加锁，粗粒度锁
     */
    public synchronized Singleton1 methodSyn() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    /**
     * 细粒度锁，性能更好
     * <p>
     * 问题：但是这种方式也不能确保真实的单例，这段代码在存在编译优化或多处理器共享内存的情况下不能够正常工作。
     * 以下摘取网上信息简单解释：
     * 前置条件：在JVM中new Singleton1()是分三步执行，但并不保证顺序。因此可能JVM会为新的Singleton1实例分配空间，然后直接赋值给成员变量，然后再去初始化这个Singleton1实例
     * 情景再现：线程A走到了实例代码行，完成了分配空间和赋值两步，准备去初始化singleton1。
     * 此时线程B执行到第一个判断，发现singleton1不为空，开始使用该变量。
     * 但是此时singleton1是一个未初始化的变量，导致系统错误。
     * <p>
     * 解决方式：在JDK1.5以后，使用volatile关键字可以很好解决
     */
    public Singleton1 doubleCheck() {
        if (singleton1 == null) {
            synchronized (this) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }


    /**
     * 登记式/静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton1 instance2 = new Singleton1();
    }

    public static final Singleton1 inClass() {
        return SingletonHolder.instance2;
    }


}
