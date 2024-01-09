package finalPract;

public class NumbersSwap {

    public static void main(String[]args){

        int a=5,b=10;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);

        int c=0;
        c=a;a=b;b=c;

        System.out.println(a+" "+b);

    }
}
