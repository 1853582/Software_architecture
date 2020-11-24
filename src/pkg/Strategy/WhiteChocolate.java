package pkg.Strategy;

public class WhiteChocolate implements Strategy{
    //策略之二，选择白巧克力
    @Override
    public boolean doChocolate(String chocType) {
        System.out.println(".........");
        System.out.println("白巧克力（white chocolate）是由可可脂、糖、牛奶和香料（香草香料）制成的，不含可可粉的巧克力。");
        System.out.println("白巧克力成分与牛奶巧克力基本相同，只是不含可可粉，乳制品和糖粉的含量相对较大，甜度高。也就是说，白巧克力的脂肪含量非常高。");
        System.out.println("不过，白巧克力的口感十分的香甜，非常的惹女孩子喜欢。");
        System.out.println(".........");
        return true;
    }
}
