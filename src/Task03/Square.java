package Task03;

public class Square implements Shape {
    @Override
    public void draw() {
        int size = 5;

        int i = 0;
        while (i < size) {
            int j = 0;
            while (j < size) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
