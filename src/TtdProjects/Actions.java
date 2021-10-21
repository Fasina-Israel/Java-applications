package TtdProjects;

import java.util.ArrayList;

public interface Actions {
    void add(String name);
    void delete(String name);
    void modify(String name);
    void search(String name);
    void insert(String name, int position);
    void printList();
    String getName(int position);
    ArrayList<String> getAll();
}
