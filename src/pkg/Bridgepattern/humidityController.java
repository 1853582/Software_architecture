package pkg.Bridgepattern;

public class humidityController extends Device{

    @Override
    public void excuteOperation(Operation operation) {

    }

    @Override
    public String getName() {
        return "湿度控制器"+this.operation.getOperationName();
    }
    // 拼接得到湿度设备和操作的连接说明
}
