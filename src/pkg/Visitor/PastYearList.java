package pkg.Visitor;

public class PastYearList {
    public DataAndTime DataAndTime1 = new DataAndTime();
    public DataAndTime DataAndTime2 = new DataAndTime();
    public DataAndTime DataAndTime3 = new DataAndTime();
    public DataAndTime DataAndTime4 = new DataAndTime();
    public DataAndTime DataAndTime5 = new DataAndTime();

    public PastYearList() {
    }

    public void closeShowList() {
    }

    public void init() {
        System.out.println("哦~我的小查理，快看呀！这就是我们巧克力工厂的历史年表哦~");
        System.out.println("小查理闻讯抬头一看，果然屏幕上出现了如下表格：");
        System.out.println("=========历史年表========");
        System.out.println("年份   巧克力名");
        this.DataAndTime1.init(2020, "拿铁巧克力");
        this.DataAndTime2.init(2018, "酒心巧克力");
        this.DataAndTime3.init(2016, "榛子巧克力");
        this.DataAndTime4.init(2008, "牛奶巧克力");
        this.DataAndTime5.init(1998, "松果巧克力");
    }
}
