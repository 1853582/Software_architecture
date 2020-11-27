package pkg;

import pkg.Interpreter.events;
import pkg.Observer.ObserverPattern;
import pkg.Strategy.strategyDemo;
import pkg.Visitor.Viewer;

public class Demo {
    public static void main(String[] args) {
        System.out.println("查理来到庄严雄伟的巧克力工厂门口");
        System.out.println("门口的威利旺卡已经等候多时了");
        System.out.println("威利旺卡：欢迎参观我的巧克力工厂！");
        System.out.println(".........");
        //------------------------------------------------------------------------------------------------
        ObserverPattern.opevent();
        //------------------------------------------------------------------------------------------------
        Viewer viewer = new Viewer();
        viewer.veiwHotList();
        viewer.veiwPastYearList();
        //------------------------------------------------------------------------------------------------
        System.out.println(".........");
        //-------------LDL的介绍巧克力部分，运用策略模式--------------------------------------------------------
        strategyDemo theStrategy = new strategyDemo();
        theStrategy.strategyEvent();
        //------------------------------------------------------------------------------------------------
        System.out.println(".........");
        //events.ExpressionEvent();
        //身份验证事件
        //------------------------------------------------------------------------------------------------
        //命令发起者实例--男孩查理
        Invoker Charlie = new Invoker();
        while(true){
            //男孩查理发出命令
            Charlie.setCommand();
        }
    }
}
