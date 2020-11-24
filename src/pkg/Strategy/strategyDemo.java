package pkg.LDL.Strategy;
//import pkg.LDL.*;
import pkg.LDL.Composite.CompositeDemo;

import java.util.Scanner;

public class strategyDemo {
    public void strategyEvent(){
        CompositeDemo Boss = CompositeDemo.getInstance();
        for(int i=0;i<2;i++){
        try {
            if(i==0){
                System.out.println(Boss.theBoss.getName()+"笑着对小孩说：我的工厂可是有非常美味的巧克力哦，你想了解了解哪种巧克力呢");
            }else {
                System.out.println(Boss.theBoss.getName()+"又问道：还有呢，小朋友，畅所欲言，我们工厂的巧克力都能给你介绍介绍哦");
            }
            Scanner str = new Scanner(System.in);
            String choice = str.nextLine();
            switch (choice){
                case "黑巧克力": strategyContext contextBlack = new strategyContext(new BlackChocolate());
                    //选择了黑巧克力的策略，然后实施该策略，进行黑巧克力的介绍
                    contextBlack.doStrategy("black chocolate");
                case "白巧克力":strategyContext contextWhite = new strategyContext(new WhiteChocolate());
                    //选择了做白巧克力的策略，然后实施该策略，进行巧克力的制作
                    contextWhite.doStrategy("white chocolate");
                case "夹心巧克力":strategyContext contextStuffed = new strategyContext(new StuffedChocolate());
                    //选择了做夹心巧克力的策略，然后实施该策略，进行巧克力的制作
                    contextStuffed.doStrategy("stuffed chocolate");
                default: System.out.println("哦，小朋友，真抱歉，这种巧克力我们工厂还正在开发当中，我也没办法向你介绍更多了~");
            }
        } catch (Exception e){
            System.out.println("输入错误，请重新输入");
        }
        }
        System.out.println("那就这样吧，小朋友，时间不等人哦，我们工厂里面的东西更加有趣，让我带着你一起去瞧瞧吧！");
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
