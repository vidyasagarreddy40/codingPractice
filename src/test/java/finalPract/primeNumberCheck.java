package finalPract;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class primeNumberCheck {

    public static void main(String[]args){
        int num=13;
        boolean isPrime=true;

        for(int i=2;i<num/2;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(!isPrime){
            System.out.println(num+" is not a prime number");
        }else{
            System.out.println(num+" is a prime number");
        }
    }
}
