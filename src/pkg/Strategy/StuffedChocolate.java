package pkg.Strategy;

import java.util.Scanner;

public class StuffedChocolate implements Strategy{
    //策略之三，选择夹心巧克力
    @Override
    public boolean doChocolate(String chocType) {
        System.out.println(".........");
        System.out.println("用各种焙烤制品或各种相宜的糖果、果块、果酱等为芯子，在其外面覆盖一层纯巧克力可制成各种形状不同、口味各异的巧克力，这种巧克力就叫夹心巧克力");
        System.out.println("夹心巧克力的生产有吊排成型和注模成型两种方法。");
        System.out.println("夹心巧克力的壳模成型过程中物料冷热变化反复多次，每次都由液态转变为固态或凝固状态。");
        System.out.println("因此，夹心巧克力成型浇注，控制温度极为重要，尤其是心体料温度，若控制不当，将影响全过程的平衡操作和最终产品的品质");
        System.out.println("我的工厂做出的夹心巧克力可是非常优质美味的哦！");
        System.out.println(".........");
        new Scanner(System.in).nextLine();
        return true;
    }
}
