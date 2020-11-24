package pkg.Decorator;

public class MaterialWithContainerDecorator extends MaterialDecorator{

    public MaterialWithContainerDecorator(Material decoratedMaterial) {
        super(decoratedMaterial);
    }

    @Override
    public void wrap() {
        decoratedMaterial.wrap();
        putInGiftTicket(decoratedMaterial);
    }

    private void putInGiftTicket(Material decoratedMaterial){
        System.out.println("此包装纸中含有一张金奖券！");
    }
}
