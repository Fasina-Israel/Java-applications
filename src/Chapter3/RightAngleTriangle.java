package Chapter3;

public class RightAngleTriangle {

    public static void main(String[] args) {

        for (int x = 1; x <= 5; x++) {
            System.out.print(x + " ");
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
