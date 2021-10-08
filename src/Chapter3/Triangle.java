package Chapter3;


import java.util.Scanner;


public class Triangle {

    public static void main(String[] args) {
        String[][] array = {{"X","O", "X"},{"O", "X", "O"},{"X", "O", "X"}};

     for(int i = 0; i < array.length; i++){
         System.out.print(i+1+" 1" +
                 "");
         for(int j = 0; j < array.length; j++){
             System.out.print(array[i][j]+"  ");
         }
         System.out.println();
     }





        String[][] myArray = {{"Femi", "Toye", "Bola"}, {"dele", "hannah", "Bisola"}, {"Seun", "Thomas", "Fola"}};

            for (int a = 0; a < myArray.length; a++){
                for (int b = 0; b < myArray.length; b++){
                    for (int x = 1; x <=myArray.length; x++){
                        System.out.print(x);
                    }
                    System.out.print(array[a][b] + " ");

                }
                System.out.println();
            }

//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int number = input.nextInt();
//        switch (number) {
//            case 1:
//                System.out.println("the number is 1");
//                break;
//            case 2:
//                System.out.println("the number is 2");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("the number is 3 4 and 5");
//                break;
//            default:
//                System.out.println("none of the number works");
//                break;
//
//
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many Student");
        int studentNumber = input.nextInt();
        System.out.println("Enter how many courses");
        int studentCourses = input.nextInt();
        int[][] studentData = new int[studentNumber][studentCourses];

        for(int row = 0; row < studentData.length; row++){
            for (int column = 0; column < studentData[row].length; column++){
                    studentData[row][column] = input.nextInt();
            }
        }
        for(int row = 0; row < studentData.length; row++){
            System.out.println("Student "+ (row+1));
            for(int column = 0; column < studentData[row].length; column++){
                System.out.println("Course "+ (column + 1) + "\t" +studentData[row][column]);
            }
            System.out.println();
        }
        for(int row = 0; row < studentData.length; row++){
            System.out.print("Student "+ (row+1)+"\t");
            for(int column = 0; column < studentData[row].length; column++){
                System.out.print(studentData[row][column]+" ");
            }
            System.out.println();
        }

//
//        for(int i = 1; i <= 5; i++){
//
//            for(int a = 1; a<= i; a++){
//                System.out.print(a+" ");
//            }
//            System.out.print("");
//            System.out.println();
//        }
//        for(int i = 1; i <= 5; i++){
//
//            for(int a = 5; a >= i; a--){
//                System.out.print(a+" ");
//
//            }

//            System.out.print("");
//            System.out.println();
//        }
//
//        for(int i = 1; i <= 5; i++){
//
//            for(int a = 1; a<= i; a++){
//                System.out.print(a+" ");
//            }
//            System.out.print("");
//            System.out.println();
//        }
//        for(int i = 1; i <= 10; i++){
//
//            for(int a = 1; a<= i; a++){
//                System.out.print(a);
//            }
//            System.out.print("");
//            System.out.println();
//        }
//        for(int i = 1; i <= 10; i++){
//
//            for(int a = 1; a <= i; a--){
//                System.out.print(a );
//            }
//            System.out.print("");
//            System.out.println();
//        }
    }
}









