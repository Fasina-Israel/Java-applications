package Practise;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int number;
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your five digit number :");
        number = input.nextInt();

        while (!((number >= 10000) && (number <= 99999))) {
            System.out.println("Oga enter Five digit number:");
            number = input.nextInt();
        }

        number1 = number % 10;
        number = number / 10;

        number2 = number % 10;
        number = number / 10;

        number3 = number % 10;
        number = number / 10;

        number4 = number % 10;
        number = number / 10;

        number5 = number;


        if ((number1 == number5) && (number2 == number4)) {
            System.out.println("this is a palindrome");
        }
            else{
                System.out.println("this is not a palindrome");
            }
        }


    }
