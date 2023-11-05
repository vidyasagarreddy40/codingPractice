import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class collsTest {


    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(4);

        nums.set(3,6);

        for (Integer s : nums) {
            System.out.println(s);
        }
        System.out.println("================");

        Iterator itr= nums.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("================");

        ListIterator listIterator=nums.listIterator();


        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
            while (listIterator.hasPrevious()){
                System.out.println(listIterator.previous());
            }
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }



    }


}
