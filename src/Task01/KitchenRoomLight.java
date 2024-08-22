package Task01;

public class KitchenRoomLight implements Light {
    private int brightness;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen light is ON at full brightness");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Kitchen light is OFF");
    }

    @Override
    public void dim(int newBrightness) {
        brightness = newBrightness;
        System.out.println("Kitchen light dimmed to " + newBrightness + "%.");
    }
}
