package pkg.hzc.Prototype.BoilerProducing;

public class SyrupBoiler extends Boiler {

    public SyrupBoiler() {
        type = "SyrupBoiler";
    }

    @Override
    public void boil() {
        System.out.println("将糖原料置入SyrupBoiler中，经过高压榨取和高温灭菌，获得制作巧克力的原料糖浆。");
    }
}
