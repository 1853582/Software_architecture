package pkg.zyl.ChainofResponsibility;
class standWeight{
    float standWeight;
    float WDvalue;

    public standWeight() {
        this.standWeight = 100.0f;
        this.WDvalue = 0.51f;
    }
}
// 巧克力质量检测器类
public class WeightCheck extends Check{
    public WeightCheck(chocolategood good) {
        //把要检测的巧克力放入检测器类
        super(good);
    }

    public  boolean  Handler(){
        standWeight stand = new standWeight();
        if(Math.abs(this.checkGood.weight-stand.standWeight)<stand.WDvalue){
            System.out.println("编号为"+this.checkGood.number+"的巧克力质量正常");
            return true;
        }
        System.out.println("编号为"+this.checkGood.number+"的巧克力质量不合格");
        return false;
    }
}
