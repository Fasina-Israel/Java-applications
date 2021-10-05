package Practise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        int number = 1;
        int largestNumber = 0;
        int secondLargestNumber = 0;

        Scanner input = new Scanner(System.in);
        while (number <= 5) {
            System.out.println("Enter your number " + number + ":");
            int userValue = input.nextInt();
            number++;

            boolean isTheLargest = userValue > largestNumber;

            if (isTheLargest) {
                secondLargestNumber = largestNumber;
                largestNumber = userValue;
            }
        }

            System.out.printf("the largest Number is %d%n", largestNumber);
            System.out.printf("the second largest Number is %d%n", secondLargestNumber);

        }
    }


