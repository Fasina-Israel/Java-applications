package NewbankPackage;

import java.util.Scanner;

public class AnotherArrayMethod {
//   sevenSegmentArray
    private static int myArray [][] = new int[5][4];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        setScreen();
        for(int a = 0; a < myArray.length; a++){
            for(int i = 0; i < myArray[a].length; i++){
                if(myArray[a][i] == 1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void setScreen(){

        setScreen1(1);
        setScreen2(1);
        setScreen3(5);
        setScreen4(1);
        setScreen5(1);
        setScreen6(8);
        setScreen7(1);

    }

    public static void setScreen1(int userValue) {
        System.out.println("Enter your number");
        int userInput = input.nextInt();
      if (userInput == userValue) {
                myArray[0][0] = 1;
                myArray[0][1] = 1;
                myArray[0][2] = 1;
                myArray[0][3] = 1;
            }
            System.out.println();
        }

    public static void setScreen2(int userValue) {
        System.out.println("Enter your number2");
        int userInput = input.nextInt();
            if (userInput == userValue) {
                myArray[0][3] = 1;
                myArray[1][3] = 1;
                myArray[2][3] = 1;
            }
            System.out.println();
        }

    public static void setScreen3(int userValue) {
        System.out.println("Enter your number3");
        int userInput = input.nextInt();
        if (userInput == userValue) {
                myArray[2][3] = 1;
                myArray[3][3] = 1;
                myArray[4][3] = 1;
            }
            System.out.println();
        }

    public static void setScreen4(int userValue) {
        System.out.println("Enter your number4");
        int userInput = input.nextInt();
            if (userInput == userValue) {
                myArray[4][0] = 1;
                myArray[4][1] = 1;
                myArray[4][2] = 1;
                myArray[4][3] = 1;
            }
            System.out.println();
        }

    public static void setScreen5(int userValue) {
        System.out.println("Enter your number5");
        int userInput = input.nextInt();

            if (userInput == userValue) {
                myArray[2][0] = 1;
                myArray[3][0] = 1;
                myArray[4][0] = 1;
            }
            System.out.println();
        }

    public static void setScreen6(int userValue) {
        System.out.println("Enter your number6");
        int userInput = input.nextInt();

            if (userInput == userValue) {
                myArray[0][0] = 1;
                myArray[1][0] = 1;
                myArray[2][0] = 1;
            }
            System.out.println();
        }

    public static void setScreen7(int userValue) {
        System.out.println("Enter your number7");
        int userInput = input.nextInt();
            if (userInput == userValue) {
                myArray[2][0] = 1;
                myArray[2][1] = 1;
                myArray[2][2] = 1;
                myArray[2][3] = 1;
            }
            System.out.println();
        }
    }


