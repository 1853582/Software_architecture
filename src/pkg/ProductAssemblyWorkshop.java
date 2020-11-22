package pkg;
import pkg.hzc.Decorator.*;
import pkg.hzc.Prototype.ChocoPacking.Choco;
import pkg.hzc.Prototype.ChocoPacking.ChocoCache;
import pkg.wck.Builder.ProductAssemblyWorkShop;

public class ProductAssemblyWorkshop implements Scene {
    private static ProductAssemblyWorkshop Instance = new ProductAssemblyWorkshop();

    public static ProductAssemblyWorkshop getInstance(){
        return Instance;
    }

    private ProductAssemblyWorkshop() { }

    @Override
    public void welcome() {
        System.out.println("Welcome to ProductAssemblyWorkshop!");
        Builder();
    }
    
    public void Builder(){
        ProductAssemblyWorkShop productAssemblyWorkShop = new ProductAssemblyWorkShop();
        Prototype();
    }
    
    public void Prototype(){
        System.out.println("介绍完毕巧克力的组装过程后，厂长问小查理");
        System.out.println("还记得之前说的原型魔法吗？其实，生产巧克力时，原型魔法也能大显身手哦！");
        System.out.println("小查理惊讶地睁大了眼睛，问");
        System.out.println("生产巧克力也可以进行‘克隆’吗？");
        System.out.println("厂长笑着说，请看这里的神奇复制机：");
        System.out.println("---------------");
        ChocoCache.loadCache();

        Choco clonedChoco = (Choco) ChocoCache.getChoco("1");
        System.out.println("Choco : " + clonedChoco.getType());

        Choco clonedChoco2 = (Choco) ChocoCache.getChoco("2");
        System.out.println("Choco : " + clonedChoco2.getType());

        Choco clonedChoco3 = (Choco) ChocoCache.getChoco("3");
        System.out.println("Choco : " + clonedChoco3.getType());
        System.out.println("---------------");
        System.out.println("原来如此，小查理恍然大悟。");
        
        Decorator();
    }

    public void Decorator(){
        System.out.println("之后，小查理又在流水线上看到了几张金光闪闪的券，问厂长是什么");
        System.out.println("这个呀，这个就是我给善良诚实的孩子的礼物，厂长笑着说");
        System.out.println("小查理问，这是怎么做到的呀？");
        System.out.println("原来厂长运用了一种魔法，它能识别购买巧克力的孩子的本性，并让善良的孩子优先选择含有奖券的巧克力购买");
        System.out.println("小查理非常好奇，看着流水线旁的出货屏幕，不由得入了神");
        System.out.println("屏幕上正好显示了几种不同的巧克力：\n");
        Material paper = new Paper();
        MaterialDecorator havingGiftPaper = new MaterialWithContainerDecorator(new Paper());
        MaterialDecorator havingGiftTinfoil = new MaterialWithContainerDecorator(new Tinfoil());
        System.out.println("---------------");
        System.out.println("普通巧克力包装：");
        paper.wrap();

        System.out.println("\n含有奖券的纸装巧克力：");
        havingGiftPaper.wrap();

        System.out.println("\n含有奖券的锡箔装巧克力：");
        havingGiftTinfoil.wrap();
        System.out.println("---------------");

        System.out.println("\n小查理若有所思，这时厂长说:6楼还有更好玩的东西，快跟我来吧！");
        System.out.println("于是一行人走到了电梯口");
    }
}
