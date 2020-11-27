package pkg;

import pkg.State.AirConditioner;
import pkg.State.CurrentState;
import pkg.State.HumidityController;
import pkg.Bridgepattern.Air_conditioner;
import pkg.Bridgepattern.TurnUp;
import pkg.Bridgepattern.humidityController;
import pkg.Proxy.*;

import java.util.Scanner;


public class HotCocoaFalls implements Scene{

    private int roomTemp;      //巧克力瀑布所在房间的室内温度
    private int temp;  //巧克力瀑布的温度
    private String sweet;
    //创建 SingleObject 的一个对象
    private static HotCocoaFalls Instance = new HotCocoaFalls();

    //让构造函数为 private，这样该类就不会被实例化
    private HotCocoaFalls(){
        this.temp=-10;
        this.roomTemp = -15;
        this.sweet="5%";
    }

    //获取唯一可用的对象
    public static HotCocoaFalls getInstance(){
        return Instance;
    }

    //向熔炉里倒入巧克力原料
    public void pourIn(){
        System.out.println("**********融化的巧克力进入巧克力瀑布**********");
    }
    //停止熔炉，将巧克力倒出
    public void pourOut(){
        //theWaterfall.temp=0;
        System.out.println("**********巧克力经过瀑布的搅拌后，变得十分顺滑无气泡了**********\n");
    }

    //设定房间温度
    public boolean setRoomTemp(int roomTemp){
        if(roomTemp>Instance.roomTemp) {
            Instance.roomTemp=roomTemp;
            System.out.println("......房间温度上升！当前房间温度为：" + roomTemp+"℃");
        }else {
            Instance.roomTemp=roomTemp;
            System.out.println("......房间温度下降！当前房间温度为：" + roomTemp+"℃");
        }
        return true;
    }
    //查看当前房间的室温
    /*public int checkRoomTemp(){
        System.out.println("当前房间的温度为："+Instance.roomTemp+"℃");
        return Instance.roomTemp;
    }3

    //查看巧克力河的内温
    public int checkTemp(){
        System.out.println("当前巧克力瀑布的温度为："+Instance.temp+"℃");
        return Instance.temp;
    }*/
    public void waterFallEvent(){
        System.out.println("---------------");
        System.out.println("威利旺卡：小朋友，来看看这里，这个小屏幕可以显示这个房间以及巧克力瀑布一些属性，巧克力甜度、温度啊，等等...");
        System.out.println("|--------------------------------------------|");
        System.out.println("|---------------巧克力瀑布监管屏幕---------------|");
        System.out.println("|------房间温度------|----------*"+Instance.roomTemp+"℃"+"---------|");
        System.out.println("|------巧克力温度----|----------*"+Instance.temp+"℃"+"----------|");
        System.out.println("|------巧克力甜度----|-----------"+Instance.sweet+"------------|");
        System.out.println("|--------------------------------------------|");
        System.out.println("威利旺卡：通过触碰这个小屏幕，也可手动进行调节房间温度哦，你想要这个房间温暖一点还是再凉爽一点呢？");
        Scanner str =new Scanner(System.in);
        String choice=str.nextLine();
        if(choice.equals("温暖一点")||choice.equals("温暖点")||choice.equals("温暖")){
            Instance.setRoomTemp(-12);
        }else if(choice.equals("凉爽一点")||choice.equals("凉爽点")||choice.equals("凉爽")){
            Instance.setRoomTemp(-18);
        }else {
            System.out.println("好吧，你不想温度改变的话，我们就继续参观后面了哦");
        }
        System.out.println("威利旺卡：小朋友，怎么样，我的巧克力瀑布很神奇吧\n");
    }

    @Override
    public void welcome() {
        System.out.println("Welcome to HotCocoaFalls!");
        System.out.println("威利旺卡：小朋友，欢迎来参观我们工厂的巧克力瀑布，这个瀑布可是我们经过多年研制出来的搅拌巧克力的利器啊");
        System.out.println("威利旺卡：它可以让巧克力变得更加顺滑，没有气泡，让巧克力的口感更加丰富，大大地提升巧克力的品质");
        Instance.pourIn();
        System.out.println("威利旺卡：瞧，巧克力瀑布正在流淌！");
        Instance.pourOut();
        new Scanner(System.in).nextLine();
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
        //使用桥接模式
        Air_conditioner air = new Air_conditioner();
        air.setOperation(new TurnUp());
        System.out.println(air.getName());

        System.out.println("---------------");
        currentState.setStemp("适宜");
        airConditioner.doAction(currentState);
        new Scanner(System.in).nextLine();

        //湿度
        currentState.setShumi("潮湿");
        System.out.println("厂长接着说：这个楼层很潮湿！不是吗？");
        System.out.println("没关系！我们还有奇妙的湿度控制器！");
        System.out.println("现在这层楼处于"+currentState.getShumi()+"状态！");
        HumidityController humidityController = new HumidityController();
        humidityController.Control(currentState);
        System.out.println("---------------");

        //调用小赵的函数，输出提升功率的提示
        //调用桥接模式
        humidityController humI = new humidityController();
        humI.setOperation(new TurnUp());
        System.out.println(humI.getName());

        System.out.println("---------------");
        currentState.setShumi("适宜");
        humidityController.Control(currentState);
        new Scanner(System.in).nextLine();

        //LDL加交互调节温度的剧情
        waterFallEvent();
        new Scanner(System.in).nextLine();
        //巧克力河被抽出送到下一楼，谭杰
        //code
        pipetteEntity entity=new pipetteEntity();
        pipetteAgent pipette=new pipetteAgent(entity);
        pipette.ShowPipette();
    }
}
