package Chapter3;


import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {


        int average = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("input your student number:");
        int studentNumber = input.nextInt();
        System.out.println("input your student course:");
        int studentCourses = input.nextInt();
        int[][] studentArray = new int[studentNumber][studentCourses];



            for (int i = 0; i < studentArray.length; i++) {
                System.out.println("Student " + (i + 1) + " ");
                for (int a = 0; a < studentArray[i].length; a++) {
                    System.out.println("Courses " + (a + 1));
                    studentArray[i][a] = input.nextInt();
                }
            }
            for(int row = 0; row< studentArray.length; row++){
                System.out.print("Student "+ (row+1)+"\t");
                for(int column = 0; column < studentArray[row].length; column++ ){
                    System.out.print(studentArray[row][column]+"    ");
                }
                System.out.println();
            }

            int[] totalArray = new int[studentArray.length];
            for(int i = 0; i < studentArray.length; i++){
              int total = 0;
              for(int a = 0; a < studentArray[i].length; a++){
                  total += studentArray[i][a];
                  totalArray[i]+= studentArray[i][a];
                  average = totalArray[i]/studentNumber;
              }
                System.out.println("=".repeat(50));
                System.out.println("The total of student"+ (i+1)+" is "+totalArray[i]);

                System.out.println("The average of student"+(i+1)+" is "+average);
            }


            }


    }



