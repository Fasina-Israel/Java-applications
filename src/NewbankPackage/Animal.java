package NewbankPackage;

public class Animal {
    private int eyes;
    private int legs;
    private int body;
    private String name;

    public Animal(int eyes, int legs, int body, String name) {
        this.eyes = eyes;
        this.legs = legs;
        this.body = body;
        this.name = name;
    }
    public void eat() {
        System.out.println("Animal.eat() called");
    }
    public void run(int speed){
        System.out.println("Animal is moving by "+ speed);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs(){
        return legs;
    }

    public int getBody(){
        return body;
    }

    public String getName() {
        return name;
    }
}
