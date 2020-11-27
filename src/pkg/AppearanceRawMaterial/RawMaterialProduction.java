package pkg.AppearanceRawMaterial;

//外观模式 外观控制类
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

        System.out.println("小松鼠看到了查理一行人，开心的打了打招呼还摇了摇尾巴\n");
        HazenutProduction();
        System.out.println("旺卡:我亲爱的松鼠朋友从遥远的西伯利亚而来，他们喜欢这个工作乐此不疲\n");
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
