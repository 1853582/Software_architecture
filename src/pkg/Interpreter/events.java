package pkg.Interpreter;

import java.util.Scanner;

public class events {
    public static void ExpressionEvent(){
        //----------------------------------------------------------------------------------------------------
        System.out.println("此时大家走到电梯门门口");
        Context door=new Context(); // 创建电梯门类
        System.out.println(
                "威利旺卡介绍道:我们的电梯门是有声控检测功能的，你需要说出你来自什么地方，叫什么名字\n电梯听到你所说的话会自动分析，然后控制开关，只有来自伦敦且注册了我们系统的人可以进入！");
        System.out.println("威利旺卡:我是来自伦敦的威利旺卡");
        door.pass("来自伦敦的威利旺卡");
        System.out.println("威利旺卡:你也试试");
        System.out.println("此时小男孩查理故意说道：我是来自柏林的查理");
        door.pass("来自柏林的查理");
        while(true){
            System.out.println("请仿照上面格式输入正确的名字和位置");
            System.out.println("我是");
            Scanner input = new Scanner(System.in);
            String str = input.next();
            if(door.pass(str)){
                break;
            }else{
                System.out.println("输入有误，请重新输入！");
                continue;
            }

        }
        System.out.println("此时大家来到电梯间");
        new Scanner(System.in).nextLine();
        //----------------------------------------------------------------------------------------------------
    }
}
