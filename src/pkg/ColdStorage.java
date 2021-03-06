package pkg;
import pkg.Flyweight.*;

import java.util.Scanner;

public class ColdStorage implements Scene{
    //创建 SingleObject 的一个对象，单例模式
    private static ColdStorage Instance = new ColdStorage();
    //获取唯一可用的对象，单例模式
    public static ColdStorage getInstance(){
        return Instance;
    }
    //冷库操作
    private ColdStoragePlants coldStoragePlants;
    public int temp=-5;  //冷库的温度
    public float Humidity=20;//冷库湿度
    public int Brightness=3;//冷库亮度
    private int[][] Capacity = new int[20][20];  //冷库的分布，0表示位置为空，1代表该位置以被占
    //让构造函数为 private，这样该类就不会被实例化，单例模式
    private ColdStorage(){
        coldStoragePlants=new ColdStoragePlants();
    }

    
    //将巧克力放入冷库
    public boolean putIn(int x,int y) {
        System.out.println(".........");
        System.out.println("将包装好的巧克力放入冷库的横"+x+"纵向"+y);
        Instance.Capacity[x][y]=1;
        return true;
    }
    //从冷库取出巧克力
    public  boolean takeOut(int x,int y){
        System.out.println(".........");
        System.out.println("冷库横"+x+"纵向"+y+"处的巧克力被取出");
        Instance.Capacity[x][y]=0;
        return true;
    }
    //检查冷库的（x,y）处是否为空位
    public boolean isEmpty(int x,int y){
        if(Instance.Capacity[x][y]==0){
            System.out.println("冷库该位置为空，没有巧克力在里面");
        }else{
            System.out.println("冷库中该位置不为空，有一块巧克力在这里");
        }
        return true;
    }
    //查看冷库的温度
    public int checkTemp(){
        return Instance.temp;
    }
    //调整冷库的温度
    public boolean setTemp(int x){
        if(x>Instance.temp) {
            Instance.temp=x;
            System.out.println("冷库温度上升！当前冷库温度为：" + Instance.temp+"℃");
        }else {
            Instance.temp=x;
            System.out.println("冷库温度下降！当前冷库温度为：" + Instance.temp+"℃");
        }
        return true;
    }
    public void showMessage(){
        System.out.println("巧克力制作过程进入冷库，开始冷藏巧克力！！！");
    }

    //LDL冷库剧情
    public void coldStorageEvent(){
        System.out.println("哒哒哒~，威利旺卡带着查理来到了冷库的另一侧，也就是巧克力储藏室");
        System.out.println(".........");
        System.out.println("威利旺卡：小朋友，瞧见这个巨大的冰冻柜了嘛，这就是我们工厂的冷库，巧克力制作完成并包装好后，便是放在这里面进行储存的");
        System.out.println("威利旺卡：这里可是有数不尽的各式各样的巧克力哟！");
        System.out.println("威利旺卡拄着他的拐杖一步一步的来到冷冻柜前，准备打开柜门，取一块巧克力出来");
        System.out.println(".........");
        new Scanner(System.in).nextLine();
        System.out.println("威利旺卡打开了一冷库的一个柜门，哗啦啦.........");
        new Scanner(System.in).nextLine();
        //用唯一的实例进行查看
        Instance.isEmpty(3,7);
        Instance.takeOut(3,7);

        System.out.println("威利旺卡：来，小朋友，这块巧克力给你尝尝");
        System.out.println("威利旺卡：emmmmm,怎么感觉房间好冷呀，让我看看房间温度");
        System.out.println("哦，对了，和巧克力瀑布处一样的哦，咋们这个冷库也有着一个可以控制温度的触摸屏呢，来让咋们把冷库温度调低一点");
        System.out.println("|--------------------------------------------|");
        System.out.println("|------------------冷库监管屏幕-----------------|");
        System.out.println("|------冷库湿度------|-----------"+Instance.Humidity+"----------|");
        System.out.println("|------冷库亮度------|-----------"+Instance.Brightness+"-------------|");
        System.out.println("|------冷库温度------|----------*"+Instance.checkTemp()+"℃"+"----------|");
        System.out.println("|--------------------------------------------|");
        System.out.println("威利旺卡：怪不得这么冷呢，温度这么低，让我把它调高一点");
        new Scanner(System.in).nextLine();
        //获取单例模式的冷库唯一实例，进行调节
        System.out.println("滴答.......");
        Instance.setTemp(-12);
        System.out.println("...........");
        System.out.println("*****冷库调节运用了单例模式，唯一的冷库*****");
        new Scanner(System.in).nextLine();
        System.out.println("威利旺卡：这个冷库可是我们工厂非常重要的一个环节，它要是出问题了，可能会危及整个工厂的巧克力，所以智能管理很重要滴！");
        new Scanner(System.in).nextLine();
    }

    //进入冷库事件
    public void EnterColdStorage()
    {
        System.out.println("小男孩来到了冷库\n");
        System.out.println("Wonka:Welcome to Cold Storage, my hidden treasure!\n" +
                "所有即将发售的商品以及来自世界各地的原料都汇集于此\n");
        new Scanner(System.in).nextLine();
        InColdStorage();
        new Scanner(System.in).nextLine();
        OutColdStorage();
        new Scanner(System.in).nextLine();
        //LDL冷库剧情丰富
        coldStorageEvent();

        System.out.println("Wonka:让我们去看一些别的东西吧.两人离开了冷库");
    }


    //奇怪的东西进入冷库事件
    public void InColdStorage()
    {
        System.out.println("一匹马拉着一辆装满货物的车飞快的冲进了冷库(享元模式触发)\n" +
                "Wonka:Look!!,这是今天新来的原料，让我看看又是什么好东西\n" +
                "Wonka从车上拿出一箱货物并打开\n");
        for(int i=0; i < 10; ++i) {
            String name=null;
            int rand=(int)(Math.random()*10);
            if(rand%4==0)
                name="妈包裹牛奶";
            if(rand%4==1)
                name="闪电可可豆";
            if(rand%4==2)
                name="耗子尾";
            if(rand%4==3)
                name="混元花生酱";
            StoredStuffs stuff = ColdStoragePlants.getColdStoragePlants().getStoredStuffs(name);
            stuff.setSize();
            stuff.setNumber();
            System.out.println("货物"+i+":"+stuff.name+",数量:"+stuff.number+",size:"+stuff.size+",描述:"+stuff.Information);
            stuff.InStorage();
        }
        System.out.println("Wonka:芜湖，好家伙,这是新来的耗子尾和其他原料，看起来味道好极了,要不要尝尝?\n" +
                "小男孩摇了摇头\n");
    }

    //奇怪的东西准备出仓库
    public void OutColdStorage()
    {
        StoredStuffs stuffs =ColdStoragePlants.getColdStoragePlants().getStoredStuffs("耗子尾汁");
        stuffs.InStorage();
        System.out.println("另一边，一些刚产出的产品被小矮人们装车即将运往各个商场\n" +
                "Wonka:哇喔，今天还有另外一些货物即将被送往世界各地，让我的小朋友看看是些啥\n" +
                "Wonka从车上，啪很快的拿到一盒产品并打开，\n" +
                "Wonka:o!!!!这正好是新鲜出炉的耗子尾汁，尝尝鲜吧孩子\n" +
                "Wonka喝了一口之后递给小男孩，可惜小男孩全部防出去了");
        stuffs=coldStoragePlants.getStoredStuffs("耗子尾汁");
        stuffs.OutOfStorage();

    }
    @Override
    public void welcome() {
        EnterColdStorage();
    }
}
