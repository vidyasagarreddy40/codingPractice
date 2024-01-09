package finalPract;

import java.util.Random;

public class RandomNumberGen {

    public static void main(String[]args){

        Random rand= new Random();

        rand.nextInt();
        System.out.println(rand.nextInt(100000));

        int max=100,min=50;

        System.out.println(rand.nextInt((max-min)+1+min));
    }
}
