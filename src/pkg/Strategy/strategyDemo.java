package pkg.Strategy;
//import pkg.LDL.*;
import pkg.Composite.CompositeDemo;

import java.util.Scanner;

public class strategyDemo {
    public void strategyEvent(){
        //该处使用了组合模式，得到员工列表
        CompositeDemo Boss = CompositeDemo.getInstance();
        for(int i=0;i<2;i++){
        try {
            if(i==0){
                System.out.println(Boss.theBoss.getName()+"笑着对小孩说：我的工厂可是有非常美味的巧克力哦，你想了解了解哪种巧克力呢(黑巧克力、白巧克力、夹心巧克力)");
            }else {
                System.out.println(Boss.theBoss.getName()+"又问道：还有呢，小朋友，畅所欲言，我们工厂的巧克力都能给你介绍介绍哦");
            }
            //选择策略，策略模式
            Scanner str = new Scanner(System.in);
            String choice = str.nextLine();
            switch (choice){
                case "黑巧克力": strategyContext contextBlack = new strategyContext(new BlackChocolate());
                    //选择了黑巧克力的策略，然后实施该策略，进行黑巧克力的介绍
                    contextBlack.doStrategy("black chocolate");
                    break;
                case "白巧克力":strategyContext contextWhite = new strategyContext(new WhiteChocolate());
                    //选择了做白巧克力的策略，然后实施该策略，进行巧克力的制作
                    contextWhite.doStrategy("white chocolate");
                    break;
                case "夹心巧克力":strategyContext contextStuffed = new strategyContext(new StuffedChocolate());
                    //选择了做夹心巧克力的策略，然后实施该策略，进行巧克力的制作
                    contextStuffed.doStrategy("stuffed chocolate");
                    break;
                default: System.out.println("哦，小朋友，真抱歉，这种巧克力我们工厂还正在开发当中，我也没办法向你介绍更多了~");
            }
        } catch (Exception e){
            System.out.println("输入错误");
        }
        }
        System.out.println("*****巧克力介绍运用了策略模式*****");
        new Scanner(System.in).nextLine();
        System.out.println("那就这样吧，小朋友，时间不等人哦，我们工厂里面的东西更加有趣，让我带着你一起去瞧瞧吧！");
        System.out.println("--------------");
        System.out.println("就这样，威利旺卡带着小男孩一起走回了电梯");
        new Scanner(System.in).nextLine();
    }
//    public static void main(String[] args){
//        strategyContext contextBlack=new strategyContext(new BlackChocolate());
//        //选择了做黑巧克力的策略，然后实施该策略，进行巧克力的制作
//        contextBlack.doStrategy("black chocolate");
//        strategyContext contextWhite=new strategyContext(new WhiteChocolate());
//        //选择了做白巧克力的策略，然后实施该策略，进行巧克力的制作
//        contextWhite.doStrategy("white chocolate");
//        strategyContext contextStuffed=new strategyContext(new StuffedChocolate());
//        //选择了做夹心巧克力的策略，然后实施该策略，进行巧克力的制作
//        contextStuffed.doStrategy("stuffed chocolate");
//    }
}
