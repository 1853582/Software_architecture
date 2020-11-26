package pkg;

public class GoToHotCocoaFalls implements Command {
    @Override
    public void execute() {
        Lift.getInstance().move(HotCocoaFalls.getInstance());
    }
}
