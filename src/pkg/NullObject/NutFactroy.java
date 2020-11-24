package pkg.NullObject;

import java.util.Random;

public class NutFactroy {

    public static AbstractNut getNut(int num){

        Random  r = new Random();
        int ran1 = r.nextInt(5);

        if (ran1 != 3) return new RealNut(num);
        return new NulNut(num);
    }
}
