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
        System.out.println("威利旺卡带着小查理来到了原料生产车间");
        System.out.println("Wonka:欢迎来到原料生产车间我的朋友");
        System.out.println("所有的原料都将在这里进行一次处理");
        System.out.println("威利旺卡指向那边并开始展示");
        //开始展示榛果生产线
        new Scanner(System.in).nextLine();
        ShowHazelnut();
        System.out.println("Wonka:而这边是我们的可可豆处理流水线");
        new Scanner(System.in).nextLine();
        ShowCacao();
        System.out.println("跟我来让我们去看一些更有趣的东西");
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
