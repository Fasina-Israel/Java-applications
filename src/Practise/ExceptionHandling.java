package Practise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    private static int result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("input your numerator");
            int numerator = scan.nextInt();
            System.out.println("input your denominator");
            int denominator = scan.nextInt();
            divisor(8, 9);
        }
        catch (InputMismatchException inputMismatchException){
            System.err.println("Exception:"+inputMismatchException);
            System.out.println("you must enter an integer");
        }

    }

   public static void divisor(int numerator, int denominator)
   throws ArithmeticException
   {
       result = numerator/denominator;
       System.out.println("the result is "+ result);
   }

    }

