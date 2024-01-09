package finalPract.LambdaPrac;

public class Demo {

    public static void test(String s){
        System.out.println(s);
    }


    public static void main(String [] args){

        FunctionIntf intf= Demo::test;
        intf.display("hello");

        FInterface fInterface=String::length;
       int i= fInterface.getLength("vidyasagar");
       System.out.println(i);
    }
}
