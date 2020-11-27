package pkg.Factory;

public class WrappingPaperFactory extends AbstractFactory {

    //具体包装纸工厂

    private static WrappingPaperFactory Instance = new WrappingPaperFactory();

    public static WrappingPaperFactory getInstance(){
        return Instance;
    }

    WrappingPaperFactory(){}

    @Override
    public Chocolate getChocolate(String ChocolateName) {
        System.out.println("包装纸制作器不能生产巧克力！");
        return null;
    }

    @Override
    public WrappingBox getWrappingBox(String BoxName) {
        System.out.println("包装纸制作器不能生产包装盒！");
       return null;
    }

    @Override
    public WrappingPaper getWrappingPaper(String PaperName) {

        switch (PaperName){
            case "锡箔" :{
                return new TinFoil();
            }
            case "金箔" :{
                return new GoldFoil();
            }
            default:{
                return  null;
            }
        }
    }
}
