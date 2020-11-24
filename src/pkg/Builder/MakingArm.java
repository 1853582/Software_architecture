package pkg.Builder;

public class MakingArm implements Making{
    //场景里的一个机械臂，用于制作巧克力

    //三种巧克力列表
    int index[] = {1,2,3};


    //实现Making接口的方法
    @Override
    public  void making() {
        Cocoa cocoa = new Cocoa();
        Milk milk = new Milk();
        Sugar sugar = new Sugar();
        Nut nut = new Nut();
        chocolateType chocolatetype = new chocolateType();

        //制作三种巧克力

           System.out.println("正在制作型号为1的巧克力，原料为——可可："+cocoa.CC(1)+"g；牛奶："+milk.MM(1)+"g；糖："+sugar.SS(1)+"g；"+nut.pout());
           chocolatetype.type1();
           System.out.println("正在制作型号为2的巧克力，原料为——可可："+cocoa.CC(2)+"g；牛奶："+milk.MM(2)+"g；糖："+sugar.SS(2)+"g.");
        chocolatetype.type2();
           System.out.println("正在制作型号为3的巧克力，原料为——可可："+cocoa.CC(2)+"g；牛奶："+milk.MM(3)+"g；糖："+sugar.SS(3)+"g.");
        chocolatetype.type3();

    };
}
