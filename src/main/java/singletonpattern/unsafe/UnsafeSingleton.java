package singletonpattern.unsafe;

/**
 * 懒加载方式
 * 不安全的单例实现（没有加锁操作，多线程下会出现问题）
 */

public class UnsafeSingleton {

    private static UnsafeSingleton instance;

    private UnsafeSingleton(){}

    public UnsafeSingleton getInstance(){
        if(instance == null){
            instance = new UnsafeSingleton();
        }
        return instance;
    }


}
