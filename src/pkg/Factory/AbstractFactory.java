package pkg.Factory;

public abstract class AbstractFactory {
    //抽象工厂类
    public abstract WrappingBox getWrappingBox(String BoxName);
    public abstract WrappingPaper getWrappingPaper(String PaperName);
    public abstract Chocolate getChocolate(String ChocolateName);
}
