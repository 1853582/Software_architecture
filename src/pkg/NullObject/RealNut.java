package pkg.NullObject;

public class RealNut extends AbstractNut{
    //完整的坚果
    public RealNut(int num){
        this.num = num;
    }

    @Override
    public boolean IsNull(){
        return false;
    };

    @Override
    public String getNum(){
        return "太棒了，这是一个完整的坚果，真是太棒了！";
    };
}
