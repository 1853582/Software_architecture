package pkg.Builder;


public class WrappingBox {
    //包装盒，有三种颜色

    String  color;
    public String WB(int w){
        switch(w){
            case 1:{
                color = "Black";
                return color;
            }
            case 2:{
                color = "White";
                return color;
            }
            case 3:{
                color = "Blue";
                return color;
            }
        }
        return "111";
    }
}
