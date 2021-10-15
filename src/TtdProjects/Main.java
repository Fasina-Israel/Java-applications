package TtdProjects;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Tell us your name");
        String name = scan.nextLine();

        System.out.println("Tell us your age");
        int age = scan.nextInt();

        System.out.println("How much do you need");
        int amount = scan.nextInt();

        System.out.println("Where do you come from");
        String country = scan.nextLine();

        Human human = new Human(name,age,"nigeria");
        Store store = new Store();

        System.out.println("Your name is "+ human.getName());
        System.out.println("Your age is "+ human.getAge());
        System.out.println("Your new age is "+ store.calculateAge(45));



    }
}
