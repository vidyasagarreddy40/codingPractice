package finalPract.multiThreadingPract;

public class subclassthread {

    public static void main(String[]args){
        ThreadClassPract t = new ThreadClassPract();

        t.start();

        int j=101;

        while(j<200){
            System.out.println(j+" "+Thread.currentThread());
            j++;
        }
    }
}
