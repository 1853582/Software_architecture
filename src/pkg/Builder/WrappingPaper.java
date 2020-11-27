package pkg.Builder;

public class WrappingPaper {
    //包装纸，有三种材料类型

    String  type;
    public String WrappingP(int w){
        switch(w){
            case 1:{
                type = "Paper";
                return type;
            }
            case 2:{
                type = "TinFoil";
                return type;
            }
            case 3:{
                type = "GoldFoil";
                return type;
            }
        }
        return "111";
    }
}
