package Practise;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>();
        students.add(1);
        students.add(2);
        students.add(3);
        students.add(4);
        students.add(5);
        students.add(6);

        printDouble(students);
    }
    public static void printDouble(ArrayList n){
        for(Object i : n){
            System.out.println((Integer)i * 2);
        }
    }



}
