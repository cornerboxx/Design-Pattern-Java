package templatepattern;

/**
 * 定义一个模板：即定义某些行为的依赖关系，但保留具体实现
 */
public abstract class Family {

    abstract Pet getPet();

    void show() {
        System.out.println("这个家里有名叫" + getPet().getName() + "的宠物");
    }

}
