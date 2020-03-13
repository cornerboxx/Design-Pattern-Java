package observerpattern;

public class Owner extends People{
        @Override
        void chickState(String state) {
            switch (state){
                case "healthy":
                    System.out.println("很健康");
                    break;
                case "sick" :
                    System.out.println("可能生病了");
                    break;
                default:
                    System.out.println("不知道什么情况");
            }
        }
    }

