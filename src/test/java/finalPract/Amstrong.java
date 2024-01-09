package finalPract;

public class Amstrong {

    public static void main(String[]args){
        int num=153,c=0,a;

        while(num!=0){

            a=num%10;

            c=c+(a*a*a);
            num=num/10;
        }
        System.out.println(c);
    }
}
