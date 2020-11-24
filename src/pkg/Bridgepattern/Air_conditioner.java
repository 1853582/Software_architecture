package pkg.Bridgepattern;

public class Air_conditioner extends Device{


    @Override
    public void excuteOperation(Operation operation) {

    }

    @Override
    public String getName() {
        return "温度控制器"+this.operation.getOperationName();
    }


}
