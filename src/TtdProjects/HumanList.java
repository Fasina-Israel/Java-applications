package TtdProjects;

import NewbankPackage.Buyer;

import java.util.ArrayList;

public class HumanList implements Actions{


    private ArrayList<String> names = new ArrayList<>();
    private int age;
    private double amount;
    private String id;



    @Override
    public void add(String name) {
        names.add(name);
    }

    @Override
    public void delete(String name) {
        names.remove(name);
    }

    @Override
    public void modify(String name) {
        names.get(3);
        names.set(3,"Fola");

    }

    @Override
    public void search(String name) {

    }

    @Override
    public void insert(String name, int position) {

    }

//    @Override
//    public void insert(String name, int position) {
//        int newPosition = position -1;
//        ArrayList<String> newArray = new ArrayList<>();
//        for (int i = 0; i < position; i++) {
//            newArray.add = names.ge
//        }
//        for (int i = 0; i < names.size(); i++) {
//            if (){
//
//            }
//        }
//    }

    @Override
    public void printList() {
        for(int i = 0; i < names.size(); i++){
        }
        System.out.println(names);

    }

    @Override
    public String getName(int position) {
        int newPosition = position -1;
        for (int i = 0; i < names.size(); i++) {
            if(i == newPosition){
                return names.get(i);
            }
        }
        return null;
    }

    public ArrayList<String> getAll(){
        return names;
    }
}

