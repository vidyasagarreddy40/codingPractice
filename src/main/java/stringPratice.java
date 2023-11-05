public class stringPratice {


    public static void main(String[]agrs){
        String a="sagar";
        String b="reddy";
        String f="SAGAR";

        System.out.println(a.length());

        System.out.println(a.compareTo(b));
        System.out.println(f.compareTo(a));

        System.out.println(a.compareToIgnoreCase(f));

        System.out.println(a.equals(f));

        System.out.println(a.startsWith("sa"));
        System.out.println(a.endsWith("ar"));

        String word="malayalam";
        System.out.println(word.indexOf("al"));
        System.out.println(word.lastIndexOf("al"));

        System.out.println(word.replace("ala","x"));

        System.out.println("this is vidyasagar".replace("is","f"));

        System.out.println(word.substring(2));
        System.out.println(word.substring(2,6));




    }

}
