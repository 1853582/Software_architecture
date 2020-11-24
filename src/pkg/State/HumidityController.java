package pkg.State;

public class HumidityController implements Humidity{
    @Override
    public void Control(CurrentState currentState) {
        String Shumi = currentState.getShumi();
        switch (Shumi) {
            case "干燥":
                System.out.println("真干燥！加湿器启动了！");
                break;
            case "适宜":
                System.out.println("真不错！湿度控制器停止运转！");
                break;
            case "潮湿":
                System.out.println("真潮湿！除湿器启动了！");
                break;
            default:
                break;
        }
    }
}
