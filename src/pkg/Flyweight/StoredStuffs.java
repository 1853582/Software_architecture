package pkg.Flyweight;

public class StoredStuffs implements StoredStuff{
    public String name;
    public int number;
    //存储物描述
    public String Information;
    public String size;
    public StoredStuffs(String name, int number,String Information,String size)
    {
        this.name=name;
        this.number=number;
        this.Information=Information;
        this.size=size;
    }
    @Override
    public void OutOfStorage() {
         ColdStoragePlants.getColdStoragePlants().storedList.remove(name);
         System.out.println("其余部分被分快的装载完毕，一匹马拉着装满了"+name+"的一辆车飞快的跑出了冷库\n");
    }

    @Override
    public void InStorage() {
        StoredStuffs stuffs=ColdStoragePlants.getColdStoragePlants().storedList.get(name);
        if (stuffs != null) {
            this.number += stuffs.number;
        }
        ColdStoragePlants.getColdStoragePlants().storedList.put(name,this);
        System.out.println(name+"被小矮人们拿进存储的区域\n");

    }

    @Override
    public void setNumber() {
        this.number=(int)(Math.random()*1000 );
    }

    @Override
    public void setSize() {
        int i=(int)(Math.random()*10);
        if(i%3==0)
            size="大";
        if(i%3==1)
            size="中";
        if(i%3==2)
            size="小";

    }
}
