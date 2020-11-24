package pkg.Builder;

public class PackingArm implements Packing{
    //场景里的一个机械臂，用于包装巧克力产品

    //三种巧克力包装列表
    int index[] = {1,2,3};

    //实现Packing接口的方法
    @Override
    public  void packing() {
        WrappingBox wrappingBox = new WrappingBox();
        WrappingPaper wrappingPaper = new WrappingPaper();

        //包装三种巧克力
        chocolateProductType chocolateProducttype = new chocolateProductType();

            System.out.println("正在包装1型巧克力产品，原料为——1型巧克力,包装纸材料："+wrappingPaper.WP(1)+"；包装盒颜色："+wrappingBox.WB(1)+".");
        chocolateProducttype.type1();
            System.out.println("正在包装2型巧克力产品，原料为——2型巧克力,包装纸材料："+wrappingPaper.WP(2)+"；包装盒颜色："+wrappingBox.WB(2)+".");
        chocolateProducttype.type2();
            System.out.println("正在包装3型巧克力产品，原料为——3型巧克力,包装纸材料："+wrappingPaper.WP(3)+"；包装盒颜色："+wrappingBox.WB(3)+".");
        chocolateProducttype.type3();

    };
}
