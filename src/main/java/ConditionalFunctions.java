public class ConditionalFunctions {

    public static void main(String[]args){
        String status="pass";

        String result;

        result= status.equalsIgnoreCase("pass")? "pass":"fail";

        System.out.println(result);

        byte a=10;

        int x=a;
        System.out.println(a);
        System.out.println(x);

        byte b= (byte) x;


    }
}
