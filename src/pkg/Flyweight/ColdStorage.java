package Flyweight;

public class ColdStorage {
    public static ColdStorage coldStorage;
    private ColdStoragePlants coldStoragePlants;
    public ColdStorage getColdStorage()
    {
        if(coldStorage==null)
            coldStorage=new ColdStorage();
        return coldStorage;
    }
    //进入冷库事件
    public void EnterColdStorage()
    {
        System.out.println("Little Boy Comes to Cold Storage\n");
        System.out.println("Wonka:Welcome to Cold Storage, my hidden treasure!\n" +
                "All the products that will be shipped to the store or the raw materials that just arrived at the factory are gathered here.\n");
        InColdStorage();
        OutColdStorage();
        System.out.println("Wonka:Let's look somewhere else, and the two men left the freezer.");
    }

    //奇怪的东西进入冷库事件
    public void InColdStorage()
    {
        StoredStuffs stuffs =new StoredStuffs("耗子尾",10000);
        System.out.println("一匹马拉着一辆装满货物的车飞快的冲进了冷库(享元模式触发)\n" +
                "Wonka:Look!!,这是今天新来的原料，让我看看又是什么好东西\n" +
                "Wonka从车上拿出一箱货物并打开\n" +
                "Wonka:芜湖，好家伙,这是新来的耗子尾，看起来味道好极了,要不要尝尝?\n" +
                "小男孩摇了摇头\n");
        stuffs.InStorage();
    }

    //奇怪的东西准备出仓库
    public void OutColdStorage()
    {
        StoredStuffs stuffs =new StoredStuffs("耗子尾汁",20000);
        stuffs.InStorage();
        System.out.println("另一边，一些刚产出的产品被小矮人们装车即将运往各个商场\n" +
                "Wonka:哇喔，今天还有另外一些货物即将被送往世界各地，让我的小朋友看看是些啥\n" +
                "Wonka从车上，啪很快的拿到一盒产品并打开，\n" +
                "Wonka:o!!!!这正好是新鲜出炉的耗子尾汁，尝尝鲜吧孩子\n" +
                "Wonka喝了一口之后递给小男孩，可惜小男孩全部防出去了");
        stuffs=coldStoragePlants.getStoredStuffs("耗子尾汁");
        stuffs.OutOfStorage();

    }

}
