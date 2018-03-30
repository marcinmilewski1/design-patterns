package patterns.command;

public class SwitchOffCommand implements Command {

    private final Light light;

    public SwitchOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
