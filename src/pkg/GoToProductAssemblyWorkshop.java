package pkg;

public class GoToProductAssemblyWorkshop implements Command {
    @Override
    public void execute() {
        Lift.getInstance().move(ProductAssemblyWorkshop.getInstance());
    }
}
