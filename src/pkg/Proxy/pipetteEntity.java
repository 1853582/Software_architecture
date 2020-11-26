package pkg.Proxy;

public class pipetteEntity implements pipette{
    public String name;
    public pipetteEntity()
    {
       name="001";
    }
    public pipetteEntity(String name){this.name=name;}
    @Override
    public void move() {
        System.out.println("吸管正在移动.....\n");
    }

    @Override
    public void Extraction() {
        System.out.println("吸管正在快速抽取热可可......\n");
    }

    @Override
    public void PourOut() {
        System.out.println("吸管倒出热可可......\n");
    }
}
