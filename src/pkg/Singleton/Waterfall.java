package pkg.Singleton;

import java.util.Scanner;

//巧克力瀑布担任一个搅拌巧克力的功效
public class Waterfall {
    private int roomTemp;      //巧克力瀑布所在房间的室内温度
    private int temp;  //巧克力瀑布的温度
    private String sweet;
    //创建 SingleObject 的一个对象
    private static Waterfall theWaterfall = new Waterfall(15);

    //让构造函数为 private，这样该类就不会被实例化
    private Waterfall(int temp){
        this.temp=temp;
        this.sweet="5%";
    }

    //获取唯一可用的对象
    public static Waterfall getInstance(){
        return theWaterfall;
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
        if(roomTemp>theWaterfall.roomTemp) {
            theWaterfall.roomTemp=roomTemp;
            System.out.println("房间温度上升！当前房间温度为：" + roomTemp);
        }else {
            theWaterfall.roomTemp=roomTemp;
            System.out.println("房间温度下降！当前房间温度为：" + roomTemp);
        }
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
    public void waterFallEvent(){
        System.out.println("威利旺卡：小朋友，欢迎来参观我们工厂的巧克力瀑布，这个瀑布可是我们经过多年研制出来的搅拌巧克力的利器啊");
        System.out.println("威利旺卡：它可以让巧克力变得更加顺滑，没有气泡，让巧克力的口感更加丰富，大大地提升巧克力的品质");
        theWaterfall.pourIn();
        System.out.println("威利旺卡：瞧，巧克力瀑布正在流淌！");
        theWaterfall.pourOut();
        System.out.println("威利旺卡：小朋友，来看看这里，这个小屏幕可以显示这个房间以及巧克力瀑布一些属性，巧克力甜度、温度啊，等等...");
        System.out.println("|--------------------------------------------|");
        System.out.println("|---------------巧克力瀑布监管屏幕---------------|");
        System.out.println("|------房间温度------|------------"+theWaterfall.roomTemp+"-------------|");
        System.out.println("|------巧克力温度----|-------------"+theWaterfall.temp+"------------|");
        System.out.println("|------巧克力甜度----|-------------"+theWaterfall.sweet+"------------|");
        System.out.println("|--------------------------------------------|");
        System.out.println("威利旺卡：通过触碰这个小屏幕，也可也进行调节房间温度哦，你想要这个房间温暖一点还是再凉爽一点呢？\n");
        Scanner str =new Scanner(System.in);
        String choice=str.nextLine();
        if(choice.equals("温暖")){
            theWaterfall.setRoomTemp(18);
        }else {
            theWaterfall.setRoomTemp(12);
        }
        System.out.println("威利旺卡：小朋友，怎么样，我的巧克力瀑布很神奇吧");
    }
}
