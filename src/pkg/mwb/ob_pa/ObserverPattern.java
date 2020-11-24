package pkg.mwb.ob_pa;

import java.util.*;

public class ObserverPattern {
    public static void openvent() {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new Light1();
        Observer obs2 = new Light2();
        Observer obs3 = new Light3();
        subject.add(obs1);
        subject.add(obs2);
        subject.add(obs3);
        subject.notifyObserver();
    }
}

//抽象目标
abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(); //通知观察者方法
}

//具体目标
//目标发生变化
class ConcreteSubject extends Subject {
    public void notifyObserver() {
        System.out.println("欢迎来到旺卡的巧克力工厂");
        System.out.println("威利旺卡大手一挥，这是厂长特有的手势！");
        System.out.println("--------------");

        for (Object obs : observers) {
            ((Observer) obs).response();
        }

    }
}

//抽象观察者
interface Observer {
    void response(); //做出反应
}

//具体观察者
//灯光做出变化
class Light1 implements Observer {
    public void response() {
        System.out.println("只见大厅地板荧光灯打开；");
    }
}
class Light2 implements Observer {
    public void response() {
        System.out.println("大厅墙壁上悬挂的火把像是被看不到的火把点燃，整个房间变得既明亮又温暖；");
    }
}
class Light3 implements Observer {
    public void response() {
        System.out.println("屋顶的水晶灯也开始闪烁。");
    }
}
