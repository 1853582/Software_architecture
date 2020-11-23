package pkg.factory;

public class WrappingBoxFactory extends AbstractFactory {
    private static WrappingBoxFactory Instance = new WrappingBoxFactory();

    public static WrappingBoxFactory getInstance(){
        return Instance;
    }

    WrappingBoxFactory(){}

    @Override
    public Chocolate getChocolate(String ChocolateName) {
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
        return null;
    }
}
