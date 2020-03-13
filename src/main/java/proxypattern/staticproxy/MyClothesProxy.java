package proxypattern.staticproxy;

import java.util.Calendar;

public class MyClothesProxy implements Clothes {

    private MyClothes myClothes = new MyClothes();

    public MyClothesProxy(MyClothes myClothes) {
        this.myClothes = myClothes;
    }

    @Override
    public void wear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        if (weekDay == 1 || weekDay == 7) {
            System.out.println("今天是周末，不起床");
        }else{
            System.out.println("今天是工作日，起床！");
            myClothes.wear();
            System.out.println("收拾完毕，出门。");
        }

    }
}
