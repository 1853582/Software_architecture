package pkg.hzc.Prototype.ChocoPacking;

public class WhiteChoco extends Choco{
    public WhiteChoco() {
        type = "WhiteChoco";
    }

    @Override
    public void packing() {
        System.out.println("用包装纸将白巧克力包装起来，最后装入包装盒中");
    }
}
