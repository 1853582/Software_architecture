package pkg.Flyweight;

import java.util.HashMap;

//享元模式
public class ColdStoragePlants {
  public static ColdStoragePlants coldStoragePlants;
  //HashMap加以控制
  public HashMap<String,StoredStuffs> storedList=new HashMap<String,StoredStuffs>();

    public static ColdStoragePlants getColdStoragePlants() {
        if(coldStoragePlants==null)
            coldStoragePlants=new ColdStoragePlants();
        return coldStoragePlants;
    }

    public StoredStuffs getStoredStuffs(String name)
    {
        StoredStuffs stuffs=ColdStoragePlants.getColdStoragePlants().storedList.get(name);
        return stuffs;
    }
}
