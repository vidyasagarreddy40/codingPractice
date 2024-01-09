package finalPract.multiThreadingPract;

public class ThreadClassPract extends Thread{

    @Override
    public void run() {
        int i=1;

        while(i<100){
            System.out.println(i+" "+Thread.currentThread());
            i++;
        }
    }
}
