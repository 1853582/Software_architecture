package pkg;
//import pkg.wck.Iterator.Iterator;
import pkg.Iterator.IteratorDemo;
import pkg.Builder.MakingWorkShop;

public class ChocolateMakingWorkshop implements Scene {
    private  static ChocolateMakingWorkshop Instance =new ChocolateMakingWorkshop();
    @Override
    public void welcome() {
        System.out.println("Welcome to ChocolateMakingWorkshop!");
        Builder();
    }

    public static ChocolateMakingWorkshop getInstance(){
        return Instance;
    }

    private ChocolateMakingWorkshop(){}

    public void Builder(){
        MakingWorkShop makingWorkShop = new MakingWorkShop();
        Iterator();
    }

    public void Iterator() {
        IteratorDemo iteratorDemo = new IteratorDemo();
    }
}
