package proxypattern.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;

public class MyClothesProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object result = new Object();

        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        if (weekDay == 1 || weekDay == 7) {
            System.out.println("今天是周末，不起床");
        }else{
            System.out.println("今天是工作日，起床！");
            result = methodProxy.invokeSuper(o,objects);
            System.out.println("收拾完毕，出门。");
        }

        return result;
    }


}
