package pkg.Memento;

public class MementoPattern
{
    public static void mpevent()
    {
        Originator or=new Originator(); //创建和恢复备忘录
        Caretaker cr=new Caretaker(); //保存和获取备忘录
        or.setState("配方正常保存");
        System.out.println("男孩突然想到一个问题：'如果停电的话配方会不会丢失呢？'");
        System.out.println("厂长回答：'不用怕，我们有备忘录系统的。'");
        System.out.println("'不是很懂呀'男孩很疑惑");
        System.out.println("--------------");
        System.out.println("'我给你演示一下'，厂长说'控制室，返回配方存储状态！'");
        System.out.println("产品的配方:"+or.getState());
        cr.setMemento(or.createMemento()); //保存状态
        System.out.println("--------------");
        System.out.println("'模拟停电情况！'");
        or.setState("断电导致配方丢失！");
        System.out.println("--------------");
        System.out.println("当前产品配方状态:"+or.getState());
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("备忘录系统介入！产品的配方:"+or.getState());
    }
}
//备忘录
class Memento
{
    private String state;
    public Memento(String state)
    {
        this.state=state;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return state;
    }
}
//发起人
class Originator
{
    private String state;
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState() //获取数据
    {
        return state;
    }
    public Memento createMemento() //创建备忘录
    {
        return new Memento(state);
    }
    public void restoreMemento(Memento m) //保存备忘录
    {
        this.setState(m.getState());
    }
}
//管理者
class Caretaker
{
    private Memento memento;

    //保存备忘录（保存配方）
    public void setMemento(Memento m)
    {
        memento=m;
    }

    //获取备忘录（获取新的配方）
    public Memento getMemento()
    {
        return memento;
    }
}