package NewPracticalPackage;

public class Door {

    private int number;
    private String name;
    private String id;

    public Door(int number, String name, String id) {
        this.number = number;
        this.name = name;
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public String getName(String name) {
        System.out.println("The name is "+ name);
        return name;
    }

    public String getId() {
        return id;
    }
}
