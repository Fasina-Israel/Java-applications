package NewPracticalPackage;

public class Vehicle {
    private  String name;
    private  String id;
    private Door door;
    private Boot boot;

    public Vehicle(String name, String id, Door door, Boot boot) {
        this.name = name;
        this.id = id;
        this.door = door;
        this.boot = boot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Boot getBoot() {
        return boot;
    }

    public void setBoot(Boot boot) {
        this.boot = boot;
    }
}
