package pkg;
//import pkg.wck.Iterator.Iterator;
import pkg.Iterator.IteratorDemo;
import pkg.Builder.MakingWorkShop;

import java.util.Scanner;

public class ChocolateMakingWorkshop implements Scene {
    //创建 SingleObject 的一个对象，单例模式
    private  static ChocolateMakingWorkshop Instance =new ChocolateMakingWorkshop();
    @Override
    public void welcome() {
        //调用建造者方法
        //使用建造者模式
        System.out.println("Welcome to ChocolateMakingWorkshop!");
        Builder();
    }
    //获取唯一可用的对象，单例模式
    public static ChocolateMakingWorkshop getInstance(){
        return Instance;
    }

    private ChocolateMakingWorkshop(){}

    public void Builder(){
        //调用迭代器方法
        //使用迭代器模式
        new Scanner(System.in).nextLine();
        MakingWorkShop makingWorkShop = new MakingWorkShop();
        new Scanner(System.in).nextLine();
        Iterator();
    }

    public void Iterator() {
        IteratorDemo iteratorDemo = new IteratorDemo();
        new Scanner(System.in).nextLine();
    }
}
