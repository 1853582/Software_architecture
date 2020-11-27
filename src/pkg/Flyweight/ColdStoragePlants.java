package pkg.Flyweight;

import java.util.HashMap;

//享元模式-享元类
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
        if(stuffs==null) {
            stuffs = new StoredStuffs(name, 0, "来自东亚TeacherMa的养殖场", "null");
            ColdStoragePlants.getColdStoragePlants().storedList.put(name,stuffs);
        }
        return stuffs;
    }
}
