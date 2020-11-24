package pkg.AppearanceRawMaterial;

public class RawMaterialProductionWorkshop {
    //单例模式
    private static RawMaterialProductionWorkshop rawMaterialProductionWorkshop;
    //原料生产类
    private RawMaterialProduction rawMaterialProduction;
    //构造函数
    RawMaterialProductionWorkshop()
    {
        rawMaterialProductionWorkshop=new RawMaterialProductionWorkshop();
        rawMaterialProduction=new RawMaterialProduction();
    }

    //单例模式访问接口
    public RawMaterialProductionWorkshop EnterRawMaterialProductionWorkshop()
    {
        if(rawMaterialProductionWorkshop==null) {
            rawMaterialProductionWorkshop = new RawMaterialProductionWorkshop();
        }
        return this.rawMaterialProductionWorkshop;
    }

    //车间欢迎事件函数
    public void Welcome()
    {
        System.out.println("Willy Wonka take the little boy to the raw material production\n");
        System.out.println("Wonka:Welcome to Raw Material Production Workshop my friend! \n");
        System.out.println("All raw materials will be obtained from here\n");
        System.out.println("Willy Wonka start displaying and pointing the cane over there.\n");
        //开始展示榛果生产线
        ShowHazelnut();
        System.out.println("Wonka:Over here is our cocoa bean processing \n");
        ShowCacao();
        System.out.println("Come with me, let's go see something more interesting. \n The group left the production Workshop");
    }
    //榛果处理生产展示事件
    private void ShowHazelnut()
    {
        rawMaterialProduction.HazelnutSayHello();
    }
    //可可豆生产展示事件
    private void ShowCacao()
    {
        rawMaterialProduction.CacaoSayHello();
    }
}
