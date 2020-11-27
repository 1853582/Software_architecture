package pkg;
import pkg.AppearanceRawMaterial.RawMaterialProduction;
import pkg.Prototype.BoilerProducing.BoilerCache;
import pkg.Prototype.BoilerProducing.Boiler;
import pkg.Memento.MementoPattern;
import pkg.Mediator.MediatorPattern;

import java.util.Scanner;

public class MaterialHandlingWorkshop implements Scene {
    public int temp=24;  //温度
    public float Humidity=50;//湿度
    public int Brightness=5;//亮度
    @Override
    public void welcome() {
        System.out.println("Willy Wonka take the little boy to the raw material production");
        System.out.println("Wonka:Welcome to Raw Material Production Workshop my friend! ");
        System.out.println("All raw materials will be obtained from here");
        System.out.println("Willy Wonka start displaying and pointing the cane over there.");
        //开始展示榛果生产线

        ShowHazelnut();
        System.out.println("Wonka:Over here is our cocoa bean processing ");
        ShowCacao();
        System.out.println("Come with me, let's go see something more interesting.");
        new Scanner(System.in).nextLine();
        Prototype();
    }
    //单例模式
    private static MaterialHandlingWorkshop materialHandlingWorkshop;
    //原料生产类
    private RawMaterialProduction rawMaterialProduction ;
    //构造函数
    MaterialHandlingWorkshop()
    {
        rawMaterialProduction=new RawMaterialProduction();
    }

    //单例模式访问接口
    public static MaterialHandlingWorkshop EnterMaterialProductionWorkshop()
    {
        if(materialHandlingWorkshop==null) {
            materialHandlingWorkshop = new MaterialHandlingWorkshop();
        }
        return materialHandlingWorkshop;
    }



    //榛果处理生产展示事件
    private void ShowHazelnut()
    {
        rawMaterialProduction.HazelnutSayHello();
    }
    //可可豆生产展示事件
    private void ShowCacao()
    {
        rawMaterialProduction.CacaoSayHello();
        MediatorPattern.zjzevent();
    }
    //厂长讲述加工虚空原料的过程（例如仓鼠加工榛果）
    //Code

    public void Prototype() {
        //介绍熔炉制作工艺
        System.out.println("厂长问：看到那些大火炉了吗，我的孩子？");
        System.out.println("告诉你个秘密吧，其实起初只有一台熔炉哦");
        System.out.println("一位好心的魔法师使用神奇的原型魔法，帮我‘克隆’出了其他的熔炉，这可帮了大忙了！");
        System.out.println("来看看现在我们拥有的魔法熔炉吧！");
        System.out.println("---------------");
        BoilerCache.loadCache();

        Boiler clonedBoiler = (Boiler) BoilerCache.getBoiler("1");
        System.out.println("Boiler : " + clonedBoiler.getType());

        Boiler clonedBoiler2 = (Boiler) BoilerCache.getBoiler("2");
        System.out.println("Boiler : " + clonedBoiler2.getType());

        Boiler clonedBoiler3 = (Boiler) BoilerCache.getBoiler("3");
        System.out.println("Boiler : " + clonedBoiler3.getType());
        System.out.println("---------------");
        new Scanner(System.in).nextLine();

        //保险箱，马文博
        //code
        MementoPattern.mpevent();
    }



}
