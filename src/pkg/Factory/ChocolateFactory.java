package pkg.Factory;

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
        System.out.println("巧克力制作器不能生产包装盒！");
        return null;
    }

    @Override
    public WrappingPaper getWrappingPaper(String PaperName) {
        System.out.println("巧克力制作器不能生产包装纸！");
        return null;
    }
}
