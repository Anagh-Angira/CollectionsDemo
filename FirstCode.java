import java.util.*;

public class FirstCode {

    public static void main(String[] args) {

        System.out.println("Collection Framework");

        // creating collection
        /*
         * 1. Type Safe Collection - same type of element(Objects)
         * are added to collection.
         * 
         * 2. Un-Type Safe Collection -different type of element(Objects)
         * are added to collection.
         */

        // Type safe collection
        ArrayList<String> astr = new ArrayList<>();

        astr.add("Anagh");
        // astr.add(234); Error
        astr.add("sitara");
        astr.add("kamal");
        astr.add("kamal");
        astr.add("mohan");
        astr.add("rohani");
        System.out.println(astr);
        System.out.println(astr.get(0));
        System.out.println(astr.get(2));
        System.out.println(astr);

        astr.remove(3);
        System.out.println(astr);
        astr.remove("Anagh");
        System.out.println(astr);
        System.out.println(astr.size());
        System.out.println(astr.contains("mohan"));
        System.out.println(astr.contains("Durgesh"));

        System.out.println(astr.isEmpty());
        // setting value
        astr.set(1, "Ram");
        System.out.println(astr);
        astr.add(1, "Robbin");
        System.out.println(astr);
        // astr.clear();

        // Untype Safe

        // LinkedList ll = new LinkedList<>();
        // ll.add("anagh");
        // ll.add(123);
        // ll.add(7.737);
        // ll.add(false);
    }
}