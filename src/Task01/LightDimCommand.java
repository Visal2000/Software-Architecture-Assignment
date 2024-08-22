package Task01;

public class LightDimCommand implements Command {
    private Light light;
    private int previousLevel;
    private int dimLevel;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.dimLevel = level;
    }

    @Override
    public void execute() {
        previousLevel = dimLevel;
        light.dim(dimLevel);
    }

    @Override
    public void undo() {
        light.dim(previousLevel);
    }
}
