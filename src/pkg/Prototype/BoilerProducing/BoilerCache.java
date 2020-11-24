package pkg.hzc.Prototype.BoilerProducing;
import java.util.Hashtable;

public class BoilerCache {
    private static Hashtable<String, Boiler> BoilerMap
            = new Hashtable<String, Boiler>();

    public static Boiler getBoiler(String BoilerId) {
        Boiler cachedBoiler = BoilerMap.get(BoilerId);
        return (Boiler) cachedBoiler.clone();
    }

    // 对每种熔炉都运行数据库查询，并创建该熔炉
    // BoilerMap.put(BoilerKey, Boiler);
    // 例如，我们要添加三种熔炉
    public static void loadCache() {
        MilkBoiler milkBoiler = new MilkBoiler();
        milkBoiler.setId("1");
        BoilerMap.put(milkBoiler.getId(),milkBoiler);

        SyrupBoiler syrupBoiler = new SyrupBoiler();
        syrupBoiler.setId("2");
        BoilerMap.put(syrupBoiler.getId(),syrupBoiler);

        CocoaBoiler cocoaBoiler = new CocoaBoiler();
        cocoaBoiler.setId("3");
        BoilerMap.put(cocoaBoiler.getId(),cocoaBoiler);
    }
}
