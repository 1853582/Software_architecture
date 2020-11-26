package pkg.Factory;

public class WrappingBoxFactory extends AbstractFactory {
    private static WrappingBoxFactory Instance = new WrappingBoxFactory();

    public static WrappingBoxFactory getInstance(){
        return Instance;
    }

    WrappingBoxFactory(){}

    @Override
    public Chocolate getChocolate(String ChocolateName) {
        System.out.println("包装盒制作器不能生产巧克力！");
        return null;
    }

    @Override
    public WrappingBox getWrappingBox(String BoxName) {
        switch (BoxName){
            case "铁盒" :{
                return new IronBox();
            }
            case "纸盒" :{
                return new CardboardBox();
            }
            default:{
                return  null;
            }
        }
    }

    @Override
    public WrappingPaper getWrappingPaper(String PaperName) {
        System.out.println("包装盒制作器不能生产包装纸！");
        return null;
    }
}
