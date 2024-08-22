package Task01;

public class LivingRoomLight implements Light {
    private int brightness;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living room light is ON at full brightness");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living room light is OFF");
    }

    @Override
    public void dim(int newBrightness) {
        brightness = newBrightness;
        System.out.println("Living room light dimmed to " + newBrightness + "%.");
    }
}
