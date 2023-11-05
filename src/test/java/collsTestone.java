import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class collsTestone {

    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(4);

        for (Integer s : hashSet) {
            System.out.println(s);
        }

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("vs");
        hashSet1.add("vidyasagar");
        hashSet1.add("reddy");
        hashSet1.add("ramireddy");

        for (String d : hashSet1) {
            System.out.println(d);
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("vs");
        linkedHashSet.add("vidyasagar");
        linkedHashSet.add("reddy");
        linkedHashSet.add("ramireddy");

        Iterator iterator = linkedHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("vs");
        treeSet.add("vidyasagar");
        treeSet.add("reddy");
        treeSet.add("ramireddy");

        for (String b : treeSet) {
            System.out.println(b);
        }
    }
}
