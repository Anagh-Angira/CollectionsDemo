import java.util.HashMap;

public class ThirdCode {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Core Java", 3000);
        hm.put("Basic Python", 3500);
        hm.put("Android", 4000);
        hm.put("Android", 4000);
        hm.put("Spring", 8000);
        hm.put("PHP", 2000);

        System.out.println(hm);
        System.out.println(hm.isEmpty());

    }

}
