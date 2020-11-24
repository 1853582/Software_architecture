package pkg.hzc.Decorator;

public class Tinfoil implements Material{
    @Override
    public void wrap() {
        System.out.println("包装纸的材料为锡箔");
    }
}
