package pkg.hzc.Decorator;

public class Paper implements Material{
    @Override
    public void wrap() {
        System.out.println("包装纸的材料为食品用纸");
    }
}
