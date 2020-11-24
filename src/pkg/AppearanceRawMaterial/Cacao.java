package pkg.AppearanceRawMaterial;
public class Cacao implements RawMaterial{
    private int SomeWholeCocoaBeans;
    private int SomeCocoaBeanPowder;
    Cacao()
    {
        SomeWholeCocoaBeans=100;
        SomeCocoaBeanPowder=0;
    }
    @Override
    public void product() {
        System.out.println("小矮人将可可豆整袋倒进粉碎机中 \n");
        System.out.println("奇怪的可可豆粉末增加了！");
        this.SomeWholeCocoaBeans--;
        this.SomeCocoaBeanPowder++;
    }

    @Override
    public void transportation() {
        System.out.println("可可豆粉末被装进小车带走了\n");
        this.SomeCocoaBeanPowder--;
    }
}
