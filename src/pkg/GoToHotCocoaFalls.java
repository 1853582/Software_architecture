package pkg;

public class GoToHotCocoaFalls implements Command {
    @Override
    public void execute() {
        Lift MagicLift = new Lift();
        MagicLift.move(HotCocoaFalls.getInstance());
    }
}
