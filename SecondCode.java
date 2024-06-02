import java.util.HashSet;
import java.util.TreeSet;

public class SecondCode {
    public static void main(String[] args) {

        HashSet<Double> hs = new HashSet<>();
        hs.add(14.14); // Autobox : automatically converted to its correcponding Wrapper Class
        hs.add(34.6554); // Unboxing : extract to primitive datatype

        hs.add(998.8);
        hs.add(5.8);
        hs.add(128.88);
        // hs.add(128.88); Duplicates are not allowed

        hs.add(1200.388);
        // hs.add(new Double(2344.98));
        System.out.println(hs);

        TreeSet<Double> ts = new TreeSet<>();
        ts.addAll(hs);
        System.out.println(ts);

    }

}
