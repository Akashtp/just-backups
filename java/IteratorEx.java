import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String ob = iterator.next();
            System.out.println(ob);
        }

        Set<String> set = new HashSet();
        set.add("one");
        set.add("two");
        set.add("three");

        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
