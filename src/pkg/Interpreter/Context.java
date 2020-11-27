package pkg.Interpreter;

//环境类
public class Context
{
    private String[] places={"伦敦"};//位置表
    private String[] persons={"厂长","小矮人","访客","松鼠","小松鼠","查理","威利旺卡"};//工厂职员表以及访客表
    private Expression placePerson;
    public Context()
    {
        Expression city=new endExpression(places);
        Expression person=new endExpression(persons);
        placePerson=new andExpression(city,person);

    }
    public boolean pass(String info)
            // 允许通过
    {
        boolean ok=placePerson.interpret(info);
        if(ok) {
            System.out.println("您是"+info+"，欢迎参观巧克力工厂！");
        return true;} // 身份验证通过
        else {
            System.out.println(info+"，您没有进入巧克力工厂的许可！");
        return false;} // 身份验证失败
    }
}