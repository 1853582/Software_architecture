package pkg.Singleton;
//非测试代码，已融合进其它地方
public class Boiler {
    private int temp;    //熔炉的温度
    private int time;    //设定熔炉燃烧时间，以分钟为单位
    //创建 boiler 的一个对象
    private static Boiler theBoiler = new Boiler();

    //让构造函数为 private，这样该类就不会被实例化
    private Boiler(){}

    //向熔炉里倒入巧克力原料
    public void pourIn(){
        System.out.println("巧克力原料开始倒入熔炉！！！");
    }
    //停止熔炉，将巧克力倒出
    public void pourOut(){
        theBoiler.temp=0;
        System.out.println("熔炉停止融化，开始倒出巧克力！！！");
    }

    //倒入巧克力后开始加热熔炉
    public void boil(int temp,int time){
        theBoiler.temp=temp;
        theBoiler.time=time;
        System.out.println("设定熔炉加热温度:"+temp+"摄氏度，加热时间："+time+"分钟");
        System.out.println("熔炉开始加热!");
        //输出熔炉加热的过程，每次增长5摄氏度
        for(int i=0;i<temp;){
            if(i+5>=temp){
                i=temp;
                System.out.println("加热中，当前温度为："+i+"摄氏度");
                System.out.println("加热结束，恒温保持！");
            }else {
                i +=5;
                System.out.println("加热中，当前温度为："+i+"摄氏度");
            }
        }
    }
    //查看当前熔炉温度
    public int checkTemp(){
        return theBoiler.temp;
    }

    //获取唯一可用的对象
    public static Boiler getInstance(){
        return theBoiler;
    }

    public void showMessage(){
        //判定熔炉是否处于运行状态
        if(theBoiler.temp!=0){
        System.out.println("熔炉处于运行状态，当前温度为："+theBoiler+"摄氏度");
        } else {
            System.out.println("熔炉处于停止状态");
        }
    }
}
