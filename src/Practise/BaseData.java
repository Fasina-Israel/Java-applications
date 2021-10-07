package Practise;

import java.util.Scanner;

public class BaseData {

    private static Scanner scan = new Scanner(System.in);
    private static int [] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter your numbers");
        getInput();
        displayArray(baseData);

        System.out.println("Enter your new Values");
        getInput();
        resizeArray();



    }

    private static void resizeArray() {
        int [] newArray =  baseData;
        baseData = new int[12];
        for(int a = 0; a < newArray.length; a++){
            baseData[a] = newArray[a];
            System.out.println(newArray[a] + " ");
        }


    }

    private static void displayArray(int[] arr) {
       for(int a = 0; a < arr.length; a++){
           System.out.println(arr[a] + " ");
       }
    }

    private static void getInput() {
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = scan.nextInt();

        }
    }


    }


