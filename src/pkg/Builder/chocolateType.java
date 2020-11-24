package pkg.Builder;

public class chocolateType extends chocolateTemplate{
    //巧克力原型类型

    public void type1(){
        this.type = 1;
        this.MaterialCocoa = (float)3.0;
        this.MaterialMilk = (float) 2.4;
        this.MaterialSugar = (float)1.7;
        num1++;
    };
    public void type2(){
        this.type = 2;
        this.MaterialCocoa = (float)5.3;
        this.MaterialMilk = (float)4.7;
        this.MaterialSugar = (float)3.5;
        num2++;
    };
    public void type3(){
        this.type = 3;
        this.MaterialCocoa = (float)8.4;
        this.MaterialMilk = (float)7.1;
        this.MaterialSugar = (float)6.6;
        num3++;
    };
}
