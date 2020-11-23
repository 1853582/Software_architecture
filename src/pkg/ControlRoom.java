package pkg;
import pkg.controllerRoom.*;
import pkg.*;

public class ControlRoom implements Scene{
    private static ControlRoom Instance = new ControlRoom();

    public static ControlRoom getInstance(){
        return Instance;
    }

    private ControlRoom(){}
    @Override
    public void welcome() {
        System.out.println("Wonka:Welcome to ControlRoom!我的孩子\n" +
                "这里是工厂的大脑，可以一窥工厂所有场景,可以操纵工厂流水线的运转");
        System.out.println("来吧我的孩子，来见证一下造物的奇迹！");
        ControllerUser controller=new ControllerUser();
        controller.StartUse();
    }


}
