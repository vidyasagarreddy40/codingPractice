public class stringReverse {

    public static void main(String [] args){
        String word="radar",rev="";

       for( int i=word.length()-1;i>=0;i--){
           rev=rev+word.charAt(i);
       }

        if(rev.equalsIgnoreCase(word)){
            System.out.println(word+ "  is a palindrome");
        }else{
            System.out.println(word+ " is not a palindrome");
        }
    }
}
