package pkg.Bridgepattern;

// 抽象设备类
public abstract class Device {
    public Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
    //设置要执行的操作

    public abstract void excuteOperation(Operation operation);
    // 执行操作
    public abstract String getName();
    // 得到桥接后的产物
}
