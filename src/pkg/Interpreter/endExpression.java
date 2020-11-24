package pkg.Interpreter;

import java.util.HashSet;
import java.util.Set;

// 终结符表达式类
public class endExpression implements Expression{
    private Set<String> endset= new HashSet<String>();
    // 存储终结符表达式的set集合
    public endExpression(String[] data)
    {
        for(String s : data){
            endset.add(s);
        }
    }// 构造函数，将终结符数组赋值给终结符表达式集合
    @Override
    public boolean interpret(String info) {
        if (endset.contains(info)) {
            return true;
            // 判定是否为终结符
        }
        return false;
    }
}
