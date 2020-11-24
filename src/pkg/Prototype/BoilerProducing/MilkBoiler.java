package pkg.Prototype.BoilerProducing;

public class MilkBoiler extends Boiler{

    public MilkBoiler() {
        type = "MilkBoiler";
    }

    @Override
    public void boil() {
        System.out.println("将生牛奶倒入MilkBoiler中，经过高温杀菌和风味调整，获得可以直接制作巧克力的原料牛奶。");
    }
}
