package TtdProjects;

import java.util.ArrayList;

public class HumanList {
    private ArrayList<String> names = new ArrayList<>();
    private int age;
    private String address;
    private double amount;

    public void setNames(String newNames) {
        names.add(newNames);
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void removeNames(int position) {
        names.remove(position);
    }

    public void modifyNames(int position,String newName) {
        names.set(position,newName);
        for(int i = 0; i < names.size(); i++){
            System.out.println(names);
        }
        System.out.println("The name at position "+(position + 1)+" has been changed to "+newName);

    }

    public void deleteNames(int position) {
        names.get(position);
        names.remove(position);
        System.out.println("The name at postion "+ position+" has been removed");
    }

    public String findItem(String searchItem) {
        int position = names.indexOf(searchItem);
        if(position >=0){
            return names.get(position);
        }
        return null;
    }
}

