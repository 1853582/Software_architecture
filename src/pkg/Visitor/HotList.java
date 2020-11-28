package pkg.Visitor;

public class HotList {
    public RankAndName RankAndName1 = new RankAndName();
    public RankAndName RankAndName2 = new RankAndName();
    public RankAndName RankAndName3 = new RankAndName();
    public RankAndName RankAndName4 = new RankAndName();
    public RankAndName RankAndName5 = new RankAndName();

    public HotList() {
    }

    public void closeShowList() {
    }

    public void init() {
        System.out.println("哦~我的小查理，快看呀！这就是我们巧克力工厂的热销榜哦~");
        System.out.println("小查理闻讯抬头一看，果然屏幕上出现了如下表格：");
        System.out.println("=========热销榜========");
        System.out.println("排名 巧克力名");
        this.RankAndName1.init(1, "  酒心巧克力");
        this.RankAndName2.init(2, "  榛子巧克力");
        this.RankAndName3.init(3, "  慕丝巧克力");
        this.RankAndName4.init(4, "  牛奶巧克力");
        this.RankAndName5.init(5, "  拿铁巧克力");
    }
}
