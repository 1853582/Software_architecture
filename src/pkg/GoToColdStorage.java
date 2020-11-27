package pkg;

public class GoToColdStorage implements Command {
    @Override
    public void execute() {
        Lift.getInstance().move(ColdStorage.getInstance());
    }
}
