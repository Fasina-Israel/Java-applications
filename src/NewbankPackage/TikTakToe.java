package NewbankPackage;
import java.util.Scanner;

public class TikTakToe {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] TikTak = new int[3][3];
        for (int x = 0; x < 5; x++) {
            //where player 1 plays
            System.out.println("Player 1 play");
            // collect input as cell value
            String userInput = scan.nextLine();
            //convert input to int
            int number= Integer.parseInt(userInput);
            //convert input to the index of zero
            int PlayerOne = number - 1;
            // result place the input on the number of row
            int row = PlayerOne / TikTak.length;
            // result place the input on the number of column
            int column = PlayerOne % TikTak[row].length;
            // Ssows 1 for user 1
            TikTak[row][column] = 1;
            }

            //where player 2 plays
            System.out.println("Player 2 play");
            // collect input as cell value
             String userInput = scan.nextLine();
            //convert input to int
             int number= Integer.parseInt(userInput);
            //convert input to the index of zero
            int PlayerTwo = number - 1;
            // result place the input on the number of row
            int row = PlayerTwo / TikTak.length;
            // result place the input on the number of column
            int column = PlayerTwo % TikTak[row].length;
            TikTak[row][column] = 2;




            for (int a = 0; a < TikTak.length; a++) {
                for (int i = 0; i < TikTak[a].length; i++) {
                    System.out.print("   " + TikTak[a][i]);
                }
                System.out.println();
                System.out.println();
            }
            if((TikTak[0][0] == 1 && TikTak[0][1] == 1 && TikTak[0][2] == 1) ||
                    (TikTak[1][0] == 1 && TikTak[1][1] == 1 && TikTak[1][2] == 1) ||
                    (TikTak[2][0] == 1 && TikTak[2][1] == 1 && TikTak[2][2] == 1)) {
                System.out.println("Player 1 wins");
                System.out.println();
            } else {
                System.out.println("Player 2 wins");
                System.out.println();

            }
        }

    }







