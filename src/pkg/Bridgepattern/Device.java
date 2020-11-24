package pkg.zyl.Bridgepattern;

// 抽象设备类
public abstract class Device {
    public Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public abstract void excuteOperation(Operation operation);
    public abstract String getName();
}
