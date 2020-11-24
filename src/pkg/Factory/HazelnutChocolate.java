package pkg.factory;

public class HazelnutChocolate implements Chocolate {
    HazelnutChocolate(){
        this.display();
    }
    @Override
    public void display() {
        System.out.println("得到了一块榛果巧克力！");
    }
}
