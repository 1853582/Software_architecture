package pkg.factory;

public class GoldFoil implements WrappingPaper {
    GoldFoil(){
        this.display();
    }

    @Override
    public void display() {
        System.out.println("得到了一张金箔！");
    }
}
