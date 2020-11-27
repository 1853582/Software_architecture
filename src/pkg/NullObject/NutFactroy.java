package pkg.NullObject;

import java.util.Random;

public class NutFactroy {
    //坚果是否为空的定义类
    public static AbstractNut getNut(int num){

        //随机数，模拟概率空坚果
        Random  r = new Random();
        int ran1 = r.nextInt(5);

        if (ran1 != 3) return new RealNut(num);
        return new NulNut(num);
    }
}
