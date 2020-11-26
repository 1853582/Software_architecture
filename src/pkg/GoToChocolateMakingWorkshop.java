package pkg;

public class GoToChocolateMakingWorkshop implements Command {
    @Override
    public void execute() {
        Lift.getInstance().move(ChocolateMakingWorkshop.getInstance());
    }
}
