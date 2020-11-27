package pkg;

public class FactoryHall implements Scene {
    //创建 SingleObject 的一个对象，单例模式
    private static FactoryHall Instance = new FactoryHall();
    //获取唯一可用的对象，单例模式
    public static FactoryHall getInstance(){
        return Instance;
    }
    //让构造函数为 private，这样该类就不会被实例化，单例模式
    private FactoryHall(){}
    @Override
    public void welcome() {
        System.out.println("Welcome to FactoryHall!");
    }
}
