package pkg.Flyweight;

public class StoredStuffs implements StoredStuff{
    public String name;
    public int number;
    public String Information;
    public int storedID;
    public StoredStuffs(String name, int number,String Information,int storedID)
    {
        this.name=name;
        this.number=number;
        this.storedID=storedID;
        this.Information=Information;
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
}
