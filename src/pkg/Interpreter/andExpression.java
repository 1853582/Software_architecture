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
        // 分终结符表达式类
    }
    public boolean interpret(String info)
    {
        info = info.replaceAll("来自", "");
        String s[]=info.split("的");
        // 根据文法解析字符串info
        return place.interpret(s[0])&&person.interpret(s[1]);
    }
}
