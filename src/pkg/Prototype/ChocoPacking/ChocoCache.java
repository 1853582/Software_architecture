package pkg.Prototype.ChocoPacking;
import java.util.Hashtable;


public class ChocoCache {
    private static Hashtable<String, Choco> ChocoMap
            = new Hashtable<String, Choco>();

    public static Choco getChoco(String ChocoId) {
        Choco cachedChoco = ChocoMap.get(ChocoId);
        return (Choco) cachedChoco.clone();
    }

    // 对每种巧克力都运行数据库查询，并创建该巧克力
    // ChocoMap.put(ChocoKey, Choco);
    // 例如，我们要添加三种巧克力
    public static void loadCache() {
        WhiteChoco whiteChoco = new WhiteChoco();
        whiteChoco.setId("1");
        ChocoMap.put(whiteChoco.getId(),whiteChoco);

        BlackChoco blackChoco = new BlackChoco();
        blackChoco.setId("2");
        ChocoMap.put(blackChoco.getId(),blackChoco);

        FilledChoco filledChoco = new FilledChoco();
        filledChoco.setId("3");
        ChocoMap.put(filledChoco.getId(),filledChoco);
    }
}
