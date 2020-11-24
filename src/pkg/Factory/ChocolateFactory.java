package pkg.factory;

public class ChocolateFactory extends AbstractFactory {
    private static ChocolateFactory Instance = new ChocolateFactory();

    public static ChocolateFactory getInstance(){
        return Instance;
    }

    ChocolateFactory(){}

    @Override
    public Chocolate getChocolate(String ChocolateName) {
        switch (ChocolateName){
            case "牛奶巧克力" :{
                return new MilkChocolate();
            }
            case "酒心巧克力" :{
                return new WineChocolate();
            }
            case "榛果巧克力" :{
                return new HazelnutChocolate();
            }
            default:{
                return  null;
            }
        }
    }

    @Override
    public WrappingBox getWrappingBox(String BoxName) {
        return null;
    }

    @Override
    public WrappingPaper getWrappingPaper(String PaperName) {
        return null;
    }
}
