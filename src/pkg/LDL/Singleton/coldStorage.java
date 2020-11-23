package pkg.LDL.Singleton;

import java.util.Scanner;

public class coldStorage {
    private int temp;  //冷库的温度
    private int[][] Capacity = new int[20][20];  //冷库的分布，0表示位置为空，1代表该位置以被占

    //创建 SingleObject 的一个对象
    private static coldStorage theColdStorage = new coldStorage(10);

    //让构造函数为 private，这样该类就不会被实例化
    private coldStorage(int temp){ this.temp = temp;}

    //获取唯一可用的对象
    public static coldStorage getInstance(){
        return theColdStorage;
    }
    //将巧克力放入冷库
    public boolean putIn(int x,int y) {
        System.out.println("将包装好的巧克力放入冷库的横"+x+"纵向"+y);
        theColdStorage.Capacity[x][y]=1;
        return true;
    }
    //从冷库取出巧克力
    public  boolean takeOut(int x,int y){
        System.out.println("冷库横"+x+"纵向"+y+"处的巧克力被取出");
        theColdStorage.Capacity[x][y]=0;
        return true;
    }
    //检查冷库的（x,y）处是否为空位
    public boolean isEmpty(int x,int y){
        if(theColdStorage.Capacity[x][y]==0){
            System.out.println("冷库该位置为空，没有巧克力在里面");
        }else{
            System.out.println("冷库中该位置不为空，有一块巧克力在这里");
        }
        return true;
    }
    //搜寻冷库中的空位
    public int[] searchEmpty(){
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if(theColdStorage.Capacity[i][j]==0){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }
    //查看冷库的温度
    public int checkTemp(){
        return theColdStorage.temp;
    }
    //调整冷库的温度
    public boolean setTemp(int x){
        if(x>theColdStorage.temp) {
            theColdStorage.temp=x;
            System.out.println("冷库温度上升！当前冷库温度为：" + theColdStorage.temp);
        }else {
            theColdStorage.temp=x;
            System.out.println("冷库温度下降！当前冷库温度为：" + theColdStorage.temp);
        }
        return true;
    }
    public void showMessage(){
        System.out.println("巧克力制作过程进入冷库，开始冷藏巧克力！！！");
    }
    public void coldStorageEvent(){
        System.out.println("威利旺卡：小朋友，瞧见这个巨大的冰冻柜了嘛，这就是我们工厂的冷库，巧克力制作完成并包装好后，便是放在这里面进行储存的");
        System.out.println("威利旺卡：这里可是有数不尽的各式各样的巧克力哟！");
        System.out.println("威利旺卡拄着他的拐杖一步一步的来到冷冻柜前，准备打开柜门，取一块巧克力出来");
        System.out.println("威利旺卡打开了一冷库的一个柜门，哗啦啦.........");
        theColdStorage.isEmpty(3,7);
        theColdStorage.takeOut(3,7);
        System.out.println("\n");
        System.out.println("威利旺卡：来，小朋友，这块巧克力给你尝尝");
        System.out.println("威利旺卡：emmmmm,怎么感觉房间好冷呀，让我看看房间温度");
        System.out.println("哦，对了，和巧克力瀑布处一样的哦，咋们这个冷库也有着一个可以控制温度的触摸屏呢，来让咋们把冷库温度调低一点");
        System.out.println("|--------------------------------------------|");
        System.out.println("|------------------冷库监管屏幕-----------------|");
        //System.out.println("|------房间温度------|------------"+theWaterfall.roomTemp+"-------------|");
        System.out.println("|------巧克力温度----|-------------"+theColdStorage.checkTemp()+"------------|");
        //System.out.println("|------巧克力甜度----|-------------"+theWaterfall.sweet+"------------|");
        System.out.println("|--------------------------------------------|");
        System.out.println("威利旺卡：怪不得这么冷呢，温度这么低，让我把它调高一点");
        System.out.println("滴答.......");
        Scanner inTemp = new Scanner(System.in);
        int tempa = inTemp.nextInt();
        theColdStorage.setTemp(tempa);
        System.out.println("威利旺卡：这个冷库可是我们工厂非常重要的一个环节，它要是出问题了，可能会危及整个工厂的巧克力，所以智能管理很重要滴！");
    }
}
