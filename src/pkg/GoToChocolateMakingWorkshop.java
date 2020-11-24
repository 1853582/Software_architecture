package pkg;

public class GoToChocolateMakingWorkshop implements Command {
    @Override
    public void execute() {
        Lift MagicLift = new Lift();
        MagicLift.move(ChocolateMakingWorkshop.getInstance());
    }
}
