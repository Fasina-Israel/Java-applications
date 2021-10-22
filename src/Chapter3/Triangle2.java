package Chapter3;

import java.util.Scanner;

public class Triangle2 {


    public static void main(String[] args) {
        rightAngleTriangle1();
        rightAngleTriangleFacingDown();
        tensAndThousands();

    }


    public static void rightAngleTriangleFacingDown() {
        for (int i = 6; i <= 10; i++) {
            System.out.print(i + " ");
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void rightAngleTriangle1() {
        for (int x = 1; x <= 5; x++) {
            System.out.print(x + " ");
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void tensAndThousands(){
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {

                System.out.print("1");
            }
            System.out.println("o");
        }
        System.out.print("a");
        int number = 1;
        int unit = 1;
        int ten = 10;
        int hundred = 100;
        System.out.println(" number  " + "  10   " + " 100  ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int no = scan.nextInt();
        for (; number <= no; number++) {
            unit *= no;
            ten *= no;
            hundred *= no;
        }

        System.out.print(unit + "  " + ten + "  " + hundred);


    }
}



