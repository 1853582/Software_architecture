package pkg.factory;

public class TinFoil implements WrappingPaper {
    TinFoil(){
        this.display();
    }

    @Override
    public void display() {
        System.out.println("得到了一张锡箔！");
    }
}
