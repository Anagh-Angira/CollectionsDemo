import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Traverse {
    public static void main(String[] args) {

        ArrayList<String> astr = new ArrayList<>();

        astr.add("Anagh");
        astr.add("sitara");
        astr.add("kamal");
        astr.add("mohan");
        astr.add("rohani");
        astr.add("Abc");

        //
        for (String str : astr) {
            System.out.println(str + "\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer();
            System.out.println(br.reverse());
        }
        System.out.println("______________________");

        // Forward Traverse
        Iterator<String> itr = astr.iterator();

        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }

        // Backward Traverse
        System.out.println("______________________");

        ListIterator<String> li = astr.listIterator(astr.size());
        while (li.hasPrevious()) {
            String prev = li.previous();
            System.out.println(prev);
        }
        System.out.println("___________For-Each Method___________");

        astr.forEach(e -> { // lambda expression
            System.out.println(e);
        });

        System.out.println("Sorting of Element");
        TreeSet<String> set = new TreeSet<>();
        set.forEach(e -> {
            System.out.println(e);
        });

        // Comparable and Comparator custom Sorting
    }
}
