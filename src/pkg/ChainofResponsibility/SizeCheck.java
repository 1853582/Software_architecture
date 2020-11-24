package pkg.ChainofResponsibility;


class standSize{
     float standWidth;
     float standLength;
     float standthickness;
     float wlDvalue; // 长宽允许的误差值
     float tDvalue; // 厚度允许的误差值
    public float getStandWidth() {
        return standWidth;
    }

    public standSize() {
        this.standWidth =26.16f ; //cm
        this.standLength =26.16f ; //cm
        this.standthickness = 7.21f ; //mm
        this.wlDvalue = 0.30f;
        this.tDvalue = 0.10f;}

}
// 巧克力尺寸检测器类
public class SizeCheck extends Check{
    public SizeCheck(chocolategood good) {
        //把要检测的巧克力放入检测器类
        super(good);
    }

    public  boolean  Handler(){
        float width = this.checkGood.width;
        float length = this.checkGood.length;
        float thickness = this.checkGood.thickness;
        standSize stand = new standSize();
        // 允许最大误差内检测尺寸是否合格
        if((Math.abs(width-stand.standWidth)<stand.wlDvalue)&&
                (Math.abs(length-stand.standLength)<stand.wlDvalue)&&
                (Math.abs(thickness-stand.standthickness)<stand.tDvalue))
        {
            System.out.println("编号为"+this.checkGood.number+"的巧克力尺寸正常");
            return true;
        }
        System.out.println("编号为"+this.checkGood.number+"的巧克力尺寸不合格");
        return false;
    }

}
