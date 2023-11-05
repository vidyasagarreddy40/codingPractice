package prac2;

public class strPr {


    public static void main(String[]args){

        String s1="hello";
        String s2= new String("hello");


        System.out.println(s1==s2);
        try{

        }catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
        }
    }


}
