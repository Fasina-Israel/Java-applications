import java.util.LinkedList;
import java.util.Queue;

public class BBQ {
    public static void main(String[] args) {
        Queue<String> bbq = new LinkedList<String>();
        bbq.add("Jackson");
        bbq.add("Tyreeq");
        bbq.add("Susan");
        bbq.add("Solape");
        bbq.add("Biola");
        bbq.add("Mary");
        bbq.add("John");

        System.out.println(bbq);
        bbq.poll();
        System.out.println(bbq);
        System.out.println(bbq.peek());
        System.out.println(bbq.size());
        System.out.println(bbq.contains("John"));

    }

}
