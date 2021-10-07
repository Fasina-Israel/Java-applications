package Practise;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     String prompt= """
                 1 -> Show mw my name
                 2 -> Show me my age
                 3 -> Show me my course
                 4 -> Show me my country
                 Enter what you would love to know:
             """;
        System.out.println(prompt);

        int userResponse = input.nextInt();
        switch (userResponse) {
            case 1:
                System.out.println("Fasina israel");
                break;
            case 2:
                System.out.println("age is 30 years");
                break;
            case 3:
                System.out.println("course is ICT");
                break;
            case 4:
                System.out.println("country is Nigeria");
                break;


        }
    }
}