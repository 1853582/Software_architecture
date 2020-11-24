package pkg.Factory;

public class MilkChocolate implements Chocolate {
    MilkChocolate(){
        this.display();
    }
    @Override
    public void display() {
        System.out.println("得到了一块牛奶巧克力！");
    }
}
