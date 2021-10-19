package NewPracticalPackage;

public class Main {
    public static void main(String[] args) {

        Door door = new Door(678,"myame","876");
        Boot boot = new Boot("HIOME",7476,"876");
        Vehicle vehicle = new Vehicle("HUIAI","tare",door,boot);
        vehicle.getDoor().getName("NONSO");

    }
}

