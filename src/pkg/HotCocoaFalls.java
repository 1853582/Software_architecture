package pkg;

import pkg.State.AirConditioner;
import pkg.State.CurrentState;
import pkg.State.HumidityController;
import pkg.Bridgepattern.Air_conditioner;
import pkg.Bridgepattern.TurnUp;
import pkg.Bridgepattern.humidityController;
import pkg.Proxy.*;


public class HotCocoaFalls implements Scene{

    private int roomTemp;      //巧克力瀑布所在房间的室内温度
    private int temp;  //巧克力瀑布的温度
    //创建 SingleObject 的一个对象
    private static HotCocoaFalls theWaterfall = new HotCocoaFalls();

    //让构造函数为 private，这样该类就不会被实例化
    private HotCocoaFalls(){}

    //获取唯一可用的对象
    public static HotCocoaFalls getInstance(){
        return theWaterfall;
    }

    //向熔炉里倒入巧克力原料
    public void pourIn(){
        System.out.println("融化的巧克力进入巧克力瀑布！！！");
    }
    //停止熔炉，将巧克力倒出
    public void pourOut(){
        //theWaterfall.temp=0;
        System.out.println("巧克力经过瀑布的搅拌后，变得十分顺滑无气泡了！！！");
    }

    //设定房间温度
    public boolean setRoomTemp(int roomTemp){
        theWaterfall.roomTemp=roomTemp;
        System.out.println("当前房间温度为："+roomTemp);
        return true;
    }
    //查看当前房间的室温
    public int checkRoomTemp(){
        System.out.println("当前房间的温度为："+theWaterfall.roomTemp);
        return theWaterfall.roomTemp;
    }
    //查看巧克力河的内温
    public int checkTemp(){
        System.out.println("当前巧克力瀑布的温度为："+theWaterfall.temp);
        return theWaterfall.temp;
    }
    //输出当前巧克力瀑布房间的一些信息
    public void showMessage(){
        System.out.println("没有信息");
    }

    @Override
    public void welcome() {
        System.out.println("Welcome to HotCocoaFalls!");
        State();
    }

    public void State() {
        //厂长介绍这里的温度湿度控制器
        CurrentState currentState = new CurrentState();
        //温度
        currentState.setStemp("炎热");
        System.out.println("刚出电梯，一股热浪迎面扑来");
        System.out.println("厂长说：哎呀，刚加工完的热可可把整个楼层都变热了！");
        System.out.println("不过不要紧！我们有神奇的温度控制器！");
        System.out.println("我的上帝啊！它显示现在这层楼居然处于"+currentState.getStemp()+"状态！");
        //System.out.println("那么请看！");
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.doAction(currentState);
        System.out.println("---------------");

        //调用小赵的函数，输出提升功率的提示
        Air_conditioner air = new Air_conditioner();
        air.setOperation(new TurnUp());
        System.out.println(air.getName());

        System.out.println("---------------");
        currentState.setStemp("适宜");
        airConditioner.doAction(currentState);

        //湿度
        currentState.setShumi("潮湿");
        System.out.println("厂长接着说：这个楼层很潮湿！不是吗？");
        System.out.println("没关系！我们还有奇妙的湿度控制器！");
        System.out.println("现在这层楼处于"+currentState.getShumi()+"状态！");
        HumidityController humidityController = new HumidityController();
        humidityController.Control(currentState);
        System.out.println("---------------");

        //调用小赵的函数，输出提升功率的提示
        humidityController humi = new humidityController();
        humi.setOperation(new TurnUp());
        System.out.println(humi.getName());

        System.out.println("---------------");
        currentState.setShumi("适宜");
        humidityController.Control(currentState);

        //巧克力河被抽出送到下一楼，谭杰
        //code
        pipetteEntity entity=new pipetteEntity();
        pipetteAgent pipette=new pipetteAgent(entity);
        pipette.ShowPipette();
    }
}
