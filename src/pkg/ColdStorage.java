package pkg;
import pkg.Flyweight.*;
public class ColdStorage implements Scene{
    private static ColdStorage Instance = new ColdStorage();

    public static ColdStorage getInstance(){
        return Instance;
    }
    //冷库操作
    private ColdStoragePlants coldStoragePlants;
    public int temp=-5;  //冷库的温度
    public float Humidity=20;//冷库湿度
    public int Brightness=3;//冷库亮度
    private int[][] Capacity = new int[20][20];  //冷库的分布，0表示位置为空，1代表该位置以被占

    private ColdStorage(){
        coldStoragePlants=new ColdStoragePlants();
    }
    //将巧克力放入冷库
    public boolean putIn(int x,int y) {
        System.out.println("将包装好的巧克力放入冷库的横"+x+"纵向"+y);
        Instance.Capacity[x][y]=1;
        return true;
    }
    //从冷库取出巧克力
    public  boolean takeOut(int x,int y){
        System.out.println("将包装好的巧克力放入冷库的横"+x+"纵向"+y);
        Instance.Capacity[x][y]=0;
        return true;
    }
    //检查冷库的（x,y）处是否为空位
    public boolean isEmpty(int x,int y){
        if(Instance.Capacity[x][y]==0){
            System.out.println("冷库该位置为空，可以放入巧克力");
        }else{
            System.out.println("冷库中该位置不为空，不可放入巧克力");
        }
        return true;
    }
    //搜寻冷库中的空位
    public int[] searchEmpty(){
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if(Instance.Capacity[i][j]==0){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }
    //查看冷库的温度
    public int checkTemp(){
        return Instance.temp;
    }
    //调整冷库的温度
    public boolean setTemp(int x){
        Instance.temp=x;
        return true;
    }
    public void showMessage(){
        System.out.println("巧克力制作过程进入冷库，开始冷藏巧克力！！！");
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
                "Wonka从车上，很快的拿到一盒产品并打开，\n" +
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
