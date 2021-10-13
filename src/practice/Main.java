package practice;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John",6);
        calculateAge(person);
        System.out.println(person.getName() + " is "+ calculateAge(person) +"year old");


    }

    public static int calculateAge(Person person){
        return person.getAge() + 1;
    }



}
