package pkg.AppearanceRawMaterial;

import pkg.NullObject.NulDemo;

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
        //使用空对象模式
        NulDemo nulDemo = new NulDemo();
        nulDemo.demoMain();
        System.out.println("奇怪的果仁增加了！\n");
        this.nut++;
        this.Nutshell++;
    }

    @Override
    public void transportation() {
        if(this.nut>0) {
            System.out.println("榛果仁被放到了传送带上 \n");
            this.nut--;
            this.Nutshell--;
        }
    }

}
