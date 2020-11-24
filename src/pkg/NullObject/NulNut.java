package pkg.NullObject;

public class NulNut extends AbstractNut{
    public NulNut(int num){
        this.num = num;
    }

    @Override
    public boolean IsNull(){
        return true;
    };

    @Override
    public String getNum(){
        return "哦我的天，这是一个空的坚果，看来我要去寻找下一个美味的坚果了。";
    };
}
