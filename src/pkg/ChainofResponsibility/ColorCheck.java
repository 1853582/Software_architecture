package pkg.zyl.ChainofResponsibility;
// 封装不同类型巧克力标准颜色的类
class standColor{
    // 巧克力类型，0表示白巧克力，1表示黑巧克力
    // 黑巧克力标准色值为R 210 G 105 B 30
    // 白巧克力标准色值为R 255 G 251 B 240
    // 在实际检测巧克力的成色时，我们允许每个色值的误差范围为 5.0f
    public static float R(int type){
       if(type == 1){
           return 210.0f;
       }
       if(type == 2){
           return 255.0f;
       }
       return Float.MAX_VALUE; // 错误的类型
    }
    public static float G(int type){
        if(type == 1){
            return 105.0f;
        }
        if(type == 2){
            return 251.0f;
        }
        return Float.MAX_VALUE; // 错误的类型
    }
    public static float B(int type){
        if(type == 1){
            return 30.0f;
        }
        if(type == 2){
            return 240.0f;
        }
        return Float.MAX_VALUE; // 错误的类型
    }

}
// 颜色检测器类
public class ColorCheck extends Check{
    public ColorCheck(chocolategood good) {
        //把要检测的巧克力放入检测器类
        super(good);
    }

    public  boolean  Handler(){
        Color color = this.checkGood.color;
        int type =this.checkGood.type;
        //得到要检测巧克力的颜色和类型
        if((Math.abs(color.R-standColor.R(type))<5.0f)
                &&(Math.abs(color.G-standColor.G(type))<5.0f)
                &&(Math.abs(color.B-standColor.B(type))<5.0f)){
            // 要检测的巧克力rgb色值在允许误差范围内，巧克力成色没有问题
            System.out.println("编号为"+this.checkGood.number+"的巧克力成色正常");
            return true;
        }
        // 要检测的巧克力rgb色值不在允许误差范围内，巧克力成色存在问题
        System.out.println("编号为"+this.checkGood.number+"的巧克力成色不合格");
        return  false;
    }
}
