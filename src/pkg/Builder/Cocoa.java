package pkg.wck.Builder;

public class Cocoa {
    //原材料之一可可，三种量对应三种不同巧克力
    float weight;
    public float CC(int w){
        switch(w){
            case 1:{
                weight = (float)3.0;
                return weight;
            }
            case 2:{
                weight = (float)5.3;;
                return weight;
            }
            case 3:{
                weight = (float)8.4;;
                return weight;
            }
        }
        return 0;
    }
}
