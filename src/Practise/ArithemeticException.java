package Practise;

import java.util.Scanner;

public class ArithemeticException {

    private static int result;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("input your numerator");
            int numerator = scan.nextInt();
            System.out.println("input your denominator");
            int denominator = scan.nextInt();
            divisor(numerator,denominator);
        }
        catch (ArithmeticException arithmeticException){
            System.err.println("Exception:" + arithmeticException);
            System.out.println("please enter a valid integer");
            scan.nextInt();
        }

    }

    public static int divisor(int numerator, int denominator)
        throws ArithmeticException
    {
     result = numerator / denominator;
     return  result;
    }
}
