package pkg.ChainofResponsibility;

public abstract class Check {
    public chocolategood checkGood;  //要检测的巧克力
    public Check(chocolategood good){
        this.checkGood = good;
    }
    // 检测器抽象类
    public  abstract  boolean  Handler();

}
