import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class stackJava {


    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.add("sagar");
        stack.push("reddy");
        stack.add("ramireddy");


        for (String c : stack) {
            System.out.println(c);
        }

        System.out.println("================================");

        System.out.println(stack.search("ramireddy"));
        System.out.println(stack.pop());
        System.out.println(stack.peek());


        System.out.println("================================");

        for (String c : stack) {
            System.out.println(c);
        }

        System.out.println(stack.empty());


        String word = " hi vidyasagar reddy , how are you ?";

        String[] ar = word.split(" ");

        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }

        List<List<String>> parent = new ArrayList<>();
        List<String> child = new ArrayList<>();
        child.add("sagar");
        child.add("redyd");
        child.add("s");
        parent.add(child);

       System.out.println(parent.get(0).get(0));

       for(String s: parent.get(0)){
           System.out.println(s);
       }

    }

}
