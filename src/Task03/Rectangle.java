package Task03;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        int width = 6;
        int height = 4;

        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
