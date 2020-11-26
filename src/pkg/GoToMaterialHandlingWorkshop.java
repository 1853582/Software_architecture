package pkg;

public class GoToMaterialHandlingWorkshop implements Command {
    @Override
    public void execute() {
        Lift.getInstance().move(MaterialHandlingWorkshop.EnterMaterialProductionWorkshop());
    }
}
