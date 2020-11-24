package pkg.Visitor;

public class Viewer {
    PastYearList pastYearList = new PastYearList();
    HotList hotList = new HotList();

    public Viewer() {
    }

    public void veiwPastYearList() {
        this.pastYearList.init();
    }

    public void veiwHotList() {
        this.hotList.init();
    }
}
