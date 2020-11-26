package pkg;

public class GoToControlRoom implements Command {
    @Override
    public void execute() {
        Lift.getInstance().move(ControlRoom.getInstance());
    }
}
