package pkg.Proxy;

public class pipetteAgent implements pipette{

    //被代理的导管
    private pipetteEntity PipetteEntity;
    //开始代理
    public pipetteAgent(pipetteEntity pipetteEntity)
    {
        this.PipetteEntity=pipetteEntity;
    }

    public pipetteAgent() {
this.PipetteEntity=new pipetteEntity();
    }
    public pipetteAgent(String name)
    {
        this.PipetteEntity=new pipetteEntity(name);
    }

    @Override
    public void move() {
      PipetteEntity.move();
    }

    @Override
    public void Extraction() {
    PipetteEntity.Extraction();
    }

    @Override
    public void PourOut() {
        PipetteEntity.PourOut();
    }

    public void ShowPipette()
    {
        System.out.println("Wonka:这边是工厂的超大吸管，它每小时可以从巧克力河中抽取几万加仑的热可可\n");
        move();
        Extraction();
        move();

    }
}
