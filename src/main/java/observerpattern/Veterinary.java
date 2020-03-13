package observerpattern;

public class Veterinary extends People{

    @Override
    void chickState(String state) {
        switch (state){
            case "healthy":
                System.out.println("很健康");
                break;
            case "sick" :
                System.out.println("得了皮肤病");
                break;
            default:
                System.out.println("指标正常");
        }
    }
}

