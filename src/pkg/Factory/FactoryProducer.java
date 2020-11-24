package pkg.factory;

public class FactoryProducer {
    public AbstractFactory getAbstractFactory(String type){
        switch (type){
            case "巧克力" :{
                return ChocolateFactory.getInstance();
            }
            case "包装纸" :{
                return WrappingPaperFactory.getInstance();
            }
            case "包装盒" :{
                return WrappingBoxFactory.getInstance();
            }
            default:{
                return null;
            }
        }
    }
}
