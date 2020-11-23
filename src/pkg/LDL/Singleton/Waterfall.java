package pkg.LDL.Singleton;

//巧克力瀑布担任一个搅拌巧克力的功效
public class Waterfall {
    private int roomTemp;      //巧克力瀑布所在房间的室内温度
    private int temp;  //巧克力瀑布的温度
    //创建 SingleObject 的一个对象
    private static Waterfall theWaterfall = new Waterfall(15);

    //让构造函数为 private，这样该类就不会被实例化
    private Waterfall(int temp){  this.temp=temp; }

    //获取唯一可用的对象
    public static Waterfall getInstance(){
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
    public void waterFallEvent(){
        System.out.println("小朋友，这个呀，就是我们");
    }
}
