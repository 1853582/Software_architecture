package pkg.controllerRoom;

import pkg.*;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ControllerUser {
    private Controller controller=new Controller();
    private int ControlRoom;
    public void StartUse()
    {
        System.out.println("旺卡走到操控屏前准备开始操作");
        System.out.println("选择你想操作的房间（1:冷库，2：原料生产车间）");
        Scanner scan = new Scanner(System.in);
        String instruct = scan.next();
        SelectRoom(instruct);
        System.out.println("旺卡：走吧让我们去看点别的");
    }
    public void SelectRoom(String  Room)
    {
        switch (Room){
            case "1": {
                System.out.println("欢迎进行冷库的操作设置");
                System.out.println("输入运行指令，如：15,2,6(逗号隔开，分别为调节温度湿度和亮度)");
                Scanner scan = new Scanner(System.in);
                String instruct = scan.next();
                ContollerAction(instruct);
                ControlRoom=0;
                break;
            }
            case "2": {
                System.out.println("欢迎进行原料生产车间的操作设置");
                System.out.println("输入运行指令，如：15,2,6(逗号隔开，分别为调节温度湿度和亮度)");
                Scanner scan = new Scanner(System.in);
                String instruct = scan.next();
                ContollerAction(instruct);
                ControlRoom=1;
                break;
            }
            default: {
                System.out.println("很可惜这个指令好像还并不支持");
            }
        };
    }
    public void ContollerAction(String action){

        String[] array=action.split(",");
        if(array.length<3)
        {
            System.out.println("指令格式好像有误，再试一次吧 格式如：15,2,6(逗号隔开，分别为调节温度湿度和亮度)");
            Scanner scan = new Scanner(System.in);
            String instruct = scan.next();
            ContollerAction(instruct);
        }
        else {
            if (ControlRoom == 0) {
                controller.checkTemp(ColdStorage.getInstance());
                controller.setTemp(ColdStorage.getInstance(), Integer.parseInt(array[0]));
                controller.checkHumidity(ColdStorage.getInstance());
                controller.setHumidity(ColdStorage.getInstance(), Float.parseFloat(array[1]));

                controller.setBrightness(ColdStorage.getInstance(), Integer.parseInt(array[2]));
            }
            else
            {
                controller.checkTemp(MaterialHandlingWorkshop.EnterMaterialProductionWorkshop());
                controller.setTemp(MaterialHandlingWorkshop.EnterMaterialProductionWorkshop(), Integer.parseInt(array[0]));
                controller.checkHumidity(MaterialHandlingWorkshop.EnterMaterialProductionWorkshop());
                controller.setHumidity(MaterialHandlingWorkshop.EnterMaterialProductionWorkshop(), Float.parseFloat(array[1]));

                controller.setBrightness(MaterialHandlingWorkshop.EnterMaterialProductionWorkshop(), Integer.parseInt(array[2]));
            }
        }
    }
}

