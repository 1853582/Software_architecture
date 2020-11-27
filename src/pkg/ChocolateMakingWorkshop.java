package pkg;
//import pkg.wck.Iterator.Iterator;
import pkg.Iterator.IteratorDemo;
import pkg.Builder.MakingWorkShop;

import java.util.Scanner;

public class ChocolateMakingWorkshop implements Scene {
    private  static ChocolateMakingWorkshop Instance =new ChocolateMakingWorkshop();
    @Override
    public void welcome() {
        //调用建造者方法
        System.out.println("Welcome to ChocolateMakingWorkshop!");
        Builder();
    }

    public static ChocolateMakingWorkshop getInstance(){
        return Instance;
    }

    private ChocolateMakingWorkshop(){}

    public void Builder(){
        //调用迭代器方法
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
