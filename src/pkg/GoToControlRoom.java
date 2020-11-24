package pkg;

public class GoToControlRoom implements Command {
    @Override
    public void execute() {
        Lift MagicLift = new Lift();
        MagicLift.move(ControlRoom.getInstance());
    }
}
