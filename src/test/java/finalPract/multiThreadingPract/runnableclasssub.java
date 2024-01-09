package finalPract.multiThreadingPract;

public class runnableclasssub {
    public static void main(String[]args){
        RunnableInterfacePract runnableInterfacePract= new RunnableInterfacePract();
        Thread t = new Thread(runnableInterfacePract);
        t.setDaemon(true);
        t.start();


        int l=111;

        while(l<220){
            System.out.println(l+" "+Thread.currentThread());
            l++;
            Thread.yield();
        }

    }
}
