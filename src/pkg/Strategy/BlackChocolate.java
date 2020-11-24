package pkg.Strategy;

public class BlackChocolate implements Strategy{
    //策略之一，选择黑巧克力
    @Override
    public int doChocolate(String theType) {
        System.out.println("黑巧克力可是非常经典的一款巧克力呢，硬度较大，微苦，一般指可可固形物含量介于70%到99%之间，或乳质含量少于12%的巧克力。");
        System.out.println("食用黑巧克力，还可以提高机体的抗氧化水平，对健康的作用非常显著的哦");
        System.out.println("可可豆需要经过挑选、烘干、研磨、加热、搅拌、熟成、冷却、 灌模，才能形成一方完美黑亮的巧克力。");
        System.out.println("约1公斤的可可豆只能提炼出不到500公克的巧克 力精华，而制作过程至少需要经历20几个步骤,制作过程也是十分复杂的");
        return 1;
    }
}
