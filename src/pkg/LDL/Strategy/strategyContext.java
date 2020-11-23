package pkg.LDL.Strategy;

//用于main函数中查看巧克力制作策略变化时的行为变化
public class strategyContext {
    //选定的一种介绍巧克力的策略
    private Strategy strategy;

    public strategyContext(Strategy strategy){
        this.strategy = strategy;
    }
    //施行选择的策略
    public int doStrategy(String chocType){
        return strategy.doChocolate(chocType);
    }
}
