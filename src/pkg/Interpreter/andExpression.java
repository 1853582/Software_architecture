package pkg.Interpreter;

// 非终结符表达式类
class andExpression implements Expression
{
    private Expression place; //来自哪里
    private Expression person; //人物职务
    public andExpression(Expression place,Expression person)
    {
        this.place= place;
        this.person=person;
    }
    public boolean interpret(String info)
    {
        info = info.replaceAll("来自", "");
        String s[]=info.split("的");
        return place.interpret(s[0])&&person.interpret(s[1]);
    }
}
