package pkg;
import pkg.AppearanceControllerRoom.*;

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
        System.out.println("威利旺卡:小朋友，时间到了，你该回家了");
        System.out.println("小男孩查理感觉面前一片雪白，醒来时此时发现自己正躺在家里的床上，好像做了一场梦一样，男孩站起来摸一摸口袋，手上多一块巧克力");
        System.exit(0);
    }


}
