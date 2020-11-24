package pkg.Factory;

public class WrappingPaperFactory extends AbstractFactory {
    private static WrappingPaperFactory Instance = new WrappingPaperFactory();

    public static WrappingPaperFactory getInstance(){
        return Instance;
    }

    WrappingPaperFactory(){}

    @Override
    public Chocolate getChocolate(String ChocolateName) {
        return null;
    }

    @Override
    public WrappingBox getWrappingBox(String BoxName) {
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
