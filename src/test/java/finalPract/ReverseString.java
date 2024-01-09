package finalPract;

public class ReverseString {

    public static void main(String[]args){

        String name="sagar", rev="";

        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if(rev.equalsIgnoreCase(name)){
            System.out.println(name+" is a palindrome");
        }else{
            System.out.println(name+"  is not a palindrome");
        }
    }
}
