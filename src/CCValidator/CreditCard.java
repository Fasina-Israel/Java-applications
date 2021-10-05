package CCValidator;


import java.util.Scanner;

import static CCValidator.CreditCardType.*;



public class CreditCard {

    private static Scanner input = new Scanner(System.in);

    private static CreditCardType type;

    public static void main(String[] args) {
        System.out.println("Enter your card number");
        long number = input.nextLong();

        validateLength(number);
        sumOfDoubleEvenPlace(number);
        sumOfDoubleOddPlace(number);
        isValid(number);

    }

    public static boolean validateLength(long numbers) {
        String number = String.valueOf(numbers);
        return number.length() >= 13 && number.length() <= 16;
    }

    public static int sumOfDoubleEvenPlace(long numbers) {
        String number = String.valueOf(numbers);
        int lengthOfNumber = number.length();
        int multiplication;
        int sum = 0;
        for (int i = lengthOfNumber - 1; i >= 0; i -= 2) {
            multiplication = Character.getNumericValue(number.charAt(i)) * 2;
            if (multiplication < 10) {
                sum += multiplication;
            } else {
                String value = String.valueOf(multiplication);
                sum += Character.getNumericValue(value.charAt(0)) + Character.getNumericValue(value.charAt(1));

            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int sumOfDoubleOddPlace(long numbers) {
        String number = String.valueOf(numbers);
        int lengthNumber = number.length();
        int sum = 0;
        int multiplication;
        for (int i = lengthNumber - 1; i >= 0; i -= 2) {
            multiplication = Character.getNumericValue(number.charAt(i)) * 2;
            if (multiplication < 10) {
                sum += multiplication;
            } else {
                String value = String.valueOf(multiplication);
                sum += Character.getNumericValue(value.charAt(0)) + Character.getNumericValue(value.charAt(1));
            }
        }
        System.out.println(sum);
        return sum;
    }


    public CreditCardType validateCards(long number) {
        String input = String.valueOf(number);
        String firstChar = String.valueOf(input.charAt(0));

        switch (firstChar) {
            case "3":
                if (String.valueOf(input.charAt(1)).equals("7"))
                    type = VISA_CARD;
                break;
            case "4":
                type = AMERICAN_EXPRESS_CARD;
                break;
            case "5":
                type = MASTER_CARD;
                break;
            case "6":
                type = DISCOVER_CARD;
                break;
        }
        return type;
    }

    public static boolean isValid(long number) {
        int sumOfBoth = sumOfDoubleOddPlace(number) + sumOfDoubleEvenPlace(number);
         return sumOfBoth % 10 == 0;
        }



}



