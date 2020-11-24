package pkg.hzc.Prototype.ChocoPacking;

public class FilledChoco extends Choco{

    public FilledChoco() {
        type = "FilledChoco";
    }

    @Override
    public void packing() {
        System.out.println("用包装纸将夹心巧克力包装起来，最后装入包装盒中");
    }
}
