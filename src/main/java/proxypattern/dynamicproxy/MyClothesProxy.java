package proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;

public class MyClothesProxy implements InvocationHandler {
    private Object  proxyObject;

    public MyClothesProxy(Object     proxyObject) {
        this.proxyObject = proxyObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = new Object();

        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        if (weekDay == 1 || weekDay == 7) {
            System.out.println("今天是周末，不起床");
        }else{
            System.out.println("今天是工作日，起床！");
            result = method.invoke(proxyObject,args);
            System.out.println("收拾完毕，出门。");
        }
        return result;

//        return method.invoke(proxyObject, args);
    }
}
