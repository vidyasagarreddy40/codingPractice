public class JavaOperations {

    public static void main(String[]args){


        int x=3;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        int y=3;

        System.out.println(y);
        System.out.println(y++);
        System.out.println(y);

        int a=3;
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);

        int k=3;
        System.out.println(k);
        System.out.println(k--);
        System.out.println(k);

        int z=(x>a)?x:a;
        int c=(x<a)?x:a;

        System.out.println(z);
        System.out.println(c);
    }

}
