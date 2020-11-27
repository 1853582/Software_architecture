package pkg;

public class Lift implements Scene, Move{
    //创建 SingleObject 的一个对象，单例模式
    //适配器模式的主体
    private static Lift theLift = new Lift();
    //让构造函数为 private，这样该类就不会被实例化，单例模式
    private Lift(){}
    @Override
    public void welcome() {
        System.out.println("这里就是我们工厂的电梯了！");
    }
    public void move(Scene newScene)
    {
        if(newScene != null){
        newScene.welcome();
        }
        else{
            System.out.println("不存在这个场景！");
        }
    }
    //获取唯一可用的对象，单例模式
    public static Lift getInstance(){
        return theLift;
    }
}
