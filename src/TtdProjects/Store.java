package TtdProjects;



public class Store {


    private static Human human;
    private String name;
    private String address;
    private String id;

    private int phoneNumber;


    public void getHuman(Human human) {
        this.human = human;
    }

    public String getHumanName() {
        return human.getName();
    }

    public static int calculateAge(int addedAge){
        int humanAge = human.getAge() + addedAge;
        return humanAge;
    }



}
