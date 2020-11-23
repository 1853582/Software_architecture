package pkg.factory;

public class WineChocolate implements Chocolate {
    WineChocolate(){
        this.display();
    }

    @Override
    public void display() {
        System.out.println("得到了一块酒心巧克力！");
    }
}
