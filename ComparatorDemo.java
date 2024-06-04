import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    int rollno;
    String name, addr;

    @Override
    public String toString() {
        return "ComparatorDemo [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
    }

    public ComparatorDemo(int rollno, String name, String addr) {
        this.rollno = rollno;
        this.name = name;
        this.addr = addr;
    }

    public static void main(String[] args) {
        ArrayList<ComparatorDemo> al1 = new ArrayList<>();
        al1.add(new ComparatorDemo(10, "Amit", "Kanke"));
        al1.add(new ComparatorDemo(9, "Rohit", "Sili"));
        al1.add(new ComparatorDemo(11, "Kamal", "Telangana"));
        al1.add(new ComparatorDemo(8, "Ram", "England"));
        al1.add(new ComparatorDemo(12, "Rohan", "Palkishan"));

        System.out.println(al1);
        Collections.sort(al1, new SortById());

    }

}

class SortById implements Comparator<ComparatorDemo> {

    @Override
    public int compare(ComparatorDemo o1, ComparatorDemo o2) {

        return o1.rollno - o2.rollno;
    }

}

class SortByName implements Comparator<ComparatorDemo> {

    @Override
    public int compare(ComparatorDemo o1, ComparatorDemo o2) {

        return o1.name.compareTo(o2.name);
    }

}

class SortByAddr implements Comparator<ComparatorDemo> {

    @Override
    public int compare(ComparatorDemo o1, ComparatorDemo o2) {

        return o1.addr.compareTo(o2.addr);
    }

}