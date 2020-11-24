package pkg.Appearance;
public class Hazelnut implements RawMaterial {
    private int nut;
    private int Nutshell;
    Hazelnut()
    {
        nut=0;
        Nutshell=0;
    }
    @Override
    public void product() {
        System.out.println("小松鼠" +
                " 咬开了榛果并且获得了果仁 \n");
        System.out.println("奇怪的果仁增加了！\n");
        this.nut++;
        this.Nutshell++;
    }

    @Override
    public void transportation() {
        System.out.println("榛果仁被放到了传送带上 \n");
        this.nut--;
        this.Nutshell--;
    }

}
