package pkg.Builder;

public class Milk {
    //原材料之一牛奶，三种量对应三种不同巧克力
    float weight;
    public float getMilk(int w){
        switch(w){
            case 1:{
                weight = (float)2.4;
                return weight;
            }
            case 2:{
                weight = (float)4.7;;
                return weight;
            }
            case 3:{
                weight = (float)7.1;;
                return weight;
            }
        }
        return 0;
    }
}
