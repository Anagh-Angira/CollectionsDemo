import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    private String name;
    private String phn;
    private int id;

    @Override
    public int compareTo(Employee o) {

        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", phn=" + phn + ", id=" + id + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, String phn, int id) {
        this.name = name;
        this.phn = phn;
        this.id = id;
    }

    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Amit", "9838848474", 101));
        al.add(new Employee("Kuldeep", "7847474904", 102));
        al.add(new Employee("Roman", "87479403033", 104));
        al.add(new Employee("Sujeet", "6664683930", 100));
        System.out.println(al);
        Collections.sort(al);
        System.out.println("_____________Sorting Id Wise___________");
        System.out.println(al);
    }

    // Single Sorting Logic se agar data sort karna hota hai - Comparable
    // Multiple Sorting Logic se agar data sort karna ho - Comparator
}
