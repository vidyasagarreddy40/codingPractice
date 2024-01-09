package finalPract.multiThreadingPract;

public class RunnableInterfacePract implements Runnable{
    @Override
    public void run() {

        int i=20;

        while(i<110){
            System.out.println(i+" "+ Thread.currentThread());
            i++;
        }
    }
}
