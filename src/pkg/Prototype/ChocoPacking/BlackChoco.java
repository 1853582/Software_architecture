package pkg.Prototype.ChocoPacking;

public class BlackChoco extends Choco{

    public BlackChoco() {
        type = "BlackChoco";
    }

    @Override
    public void packing() {
        System.out.println("用包装纸将黑巧克力包装起来，最后装入包装盒中");
    }
}
