package pkg;

import java.util.Scanner;

public class Invoker {

    //命令模式的Invoker
    private void printKey()
    {
        System.out.println("------------");
        System.out.println("1F 工厂大厅");
        System.out.println("2F 原料加工车间");
        System.out.println("3F 热可可瀑布");
        System.out.println("4F 巧克力制作车间");
        System.out.println("5F 产品组装车间");
        System.out.println("6F 冷库");
        System.out.println("7F 控制室");
        System.out.println("------------");
    }

    //Invoker发出命令
    public void setCommand() {
        printKey();
        System.out.println("威利旺卡：孩子，你想去哪儿？");
        Scanner scan = new Scanner(System.in);
        String floor = scan.next();
        action(floor);
    }

    //执行具体动作
    public void action(String floor){
        switch (floor){
            case "1": {
                System.out.println("威利旺卡：噢!我的傻孩子，咱们就是从一楼上来的呀..还没参观完呢..");
                break;
            }
            case "2": {
                GoToMaterialHandlingWorkshop gtmhw = new GoToMaterialHandlingWorkshop();
                gtmhw.execute();
                break;
            }
            case "3": {
                GoToHotCocoaFalls gthcf = new GoToHotCocoaFalls();
                gthcf.execute();
                break;
            }
            case "4": {
                GoToChocolateMakingWorkshop gtcmw = new GoToChocolateMakingWorkshop();
                gtcmw.execute();
                break;
            }
            case "5": {
                GoToProductAssemblyWorkshop gtpaw = new GoToProductAssemblyWorkshop();
                gtpaw.execute();
                break;
            }
            case "6": {
                GoToColdStorage gtcs = new GoToColdStorage();
                gtcs.execute();
                break;
            }
            case "7": {
                GoToControlRoom gtcr = new GoToControlRoom();
                gtcr.execute();
                break;
            }
            default: {
                System.out.println("威利旺卡：抱歉，亲爱的..孩子，这里没有这个楼层，上帝一定允许我们换一层的..我敢肯定。");
            }
        };
    }

}
