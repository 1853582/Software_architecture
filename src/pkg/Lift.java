package pkg;

public class Lift implements Scene, Move{
    //适配器模式的主体
    private static Lift theLift = new Lift();
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

    public static Lift getInstance(){
        return theLift;
    }
}
