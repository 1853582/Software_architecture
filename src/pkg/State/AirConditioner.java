package pkg.State;

public class AirConditioner implements Temperature{
    @Override
    public void doAction(CurrentState currentState) {
        String Stemp = currentState.getStemp();
        switch (Stemp) {
            case "寒冷":
                System.out.println("哦请看！温度控制器开始大幅提升温度了！");
                break;
            case "微凉":
                System.out.println("哦请看！温度控制器开始提升温度了！");
                break;
            case "适宜":
                System.out.println("身心舒爽！温度控制器停止运转！");
                break;
            case "稍热":
                System.out.println("哦请看！温度控制器开始降低温度了！");
                break;
            case "炎热":
                System.out.println("哦请看！温度控制器开始大幅降低温度了！");
                break;
            default:
                break;
        }
    }
}
