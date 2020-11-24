package pkg.mwb.zhongjiezhe;
import java.util.*;
public class MediatorPattern
{
    public static void main(String[] args)
    {
        Colleague c1,c2;
        c1=new ConcreteColleague1();
        c2=new ConcreteColleague2();
        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}
//简单单例中介者
class Mediator
{
    private static Mediator smd=new Mediator();
    private List<Colleague> colleagues=new ArrayList<Colleague>();
    private Mediator(){}
    public static Mediator getMedium()
    {    return(smd);   }
    public void register(Colleague colleague)
    {
        if(!colleagues.contains(colleague))
        {
            colleagues.add(colleague);
        }
    }
    public void relay(Colleague scl)
    {
        for(Colleague ob:colleagues)
        {
            if(!ob.equals(scl))
            {
                ((Colleague)ob).receive();
            }
        }
    }
}
//抽象同事类
interface Colleague
{
    void receive();
    void send();
}
//具体同事类
class ConcreteColleague1 implements Colleague
{
    ConcreteColleague1(){
        Mediator smd= Mediator.getMedium();
        smd.register(this);
    }
    public void receive()
    {    System.out.println("虚空原料加工松鼠🐿️：收到请求，加快虚空原料加工速度");    }
    public void send()
    {
        Mediator smd= Mediator.getMedium();
        System.out.println("虚空原料加工松鼠🐿️：虚空原料严重滞留，请加快熔炉加工速度");
        smd.relay(this); //请中介者转发
    }
}
//具体同事类
class ConcreteColleague2 implements Colleague
{
    ConcreteColleague2(){
        Mediator smd= Mediator.getMedium();
        smd.register(this);
    }
    public void receive()
    {    System.out.println("熔炉加工黑熊🐻：收到请求，适当提高熔炉温度，加速原料使用！");    }
    public void send()
    {
        Mediator smd= Mediator.getMedium();
        System.out.println("熔炉加工黑熊🐻：虚空原料紧缺，请加快原料加工！");
        smd.relay(this); //请中介者转发
    }
}
