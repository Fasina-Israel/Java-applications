package TtdProjects;

public class Human {
    private String name;
    private int age;
    private double amount;
    private  String country;

    public Human(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int numberOfYears) {
        this.age = numberOfYears;
    }

    public double hasAmount() {
        return amount;
    }
    public void setName(String myName){
        this.name = myName;
    }
    public String getName(){
        return  name;
    }
}
