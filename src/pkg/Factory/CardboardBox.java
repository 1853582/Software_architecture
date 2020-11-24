package pkg.Factory;

public class CardboardBox implements WrappingBox {
    CardboardBox(){
        this.display();
    }

    @Override
    public void display() {
        System.out.println("得到了一个纸盒！");
    }
}
