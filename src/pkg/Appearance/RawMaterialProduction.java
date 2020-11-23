package pkg.Appearance;
//import pkg.LDL.*;
public class RawMaterialProduction {
    public Hazelnut hazelnut;
    public Cacao cacao;
    public RawMaterialProduction()
    {
        hazelnut=new Hazelnut();
        cacao=new Cacao();
    }

    //榛果生产展示事件
    public void HazelnutSayHello()
    {

       System.out.println("A little squirrel saw the little boy and his group and greeted them happily, wagging his tail.\n");
        HazenutProduction();
        System.out.println("Wonka:My squirrel friends came from as far away as Siberia, and they loved the work!\n");
    }
    //可可豆处理展示事件
    public void CacaoSayHello()
    {

        CacaoProduction();
    }
    //榛果生产函数--外观模式
    private void HazenutProduction()
    {
       hazelnut.product();
        hazelnut.transportation();
    }

    //可可豆粉末生产函数--外观模式
    private void CacaoProduction()
    {
        cacao.product();
        cacao.transportation();
    }
}
