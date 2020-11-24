package pkg.Builder;

public class Sugar {
    //原材料之一糖，三种量对应三种不同巧克力
    float weight;
    public float SS(int w){
        switch(w){
            case 1:{
                weight = (float)1.7;;
                return weight;
            }
            case 2:{
                weight = (float)3.5;;
                return weight;
            }
            case 3:{
                weight = (float)6.6;;
                return weight;
            }
        }
        return 0;
    }
}
