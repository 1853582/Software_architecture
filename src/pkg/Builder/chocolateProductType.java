package pkg.wck.Builder;

public class chocolateProductType extends chocolateProductTemplate{
    //巧克力产品类型
    public void type1(){
        this.type = 1;
        this.MaterialWrappingBox = "Black";
        this.MaterialWrappingPaper = "Paper";
        numP1++;
    };
    public void type2(){
        this.type = 2;
        this.MaterialWrappingBox = "White";
        this.MaterialWrappingPaper = "TinFoil";
        numP2++;
    };
    public void type3(){
        this.type = 3;
        this.MaterialWrappingBox = "Blue";
        this.MaterialWrappingPaper = "GoldFoil";
        numP3++;
    };
}
