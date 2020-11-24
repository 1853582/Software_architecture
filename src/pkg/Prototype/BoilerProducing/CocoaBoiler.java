package pkg.Prototype.BoilerProducing;

public class CocoaBoiler extends Boiler{

    public CocoaBoiler() {
        type = "CocoaBoiler";
    }

    @Override
    public void boil() {
        System.out.println("将可可果加入CocoaBoiler中，经过快速搅拌与高压灭菌，获得可以直接制作巧克力的可可浆。");
    }
}
