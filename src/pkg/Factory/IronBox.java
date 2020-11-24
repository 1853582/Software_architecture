package pkg.factory;

public class IronBox implements WrappingBox {
    IronBox(){
        this.display();
    }

    @Override
    public void display() {
        System.out.println("得到了一个铁盒！");
    }
}
