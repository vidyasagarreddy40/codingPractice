package finalPract.multiThreadingPract;

public class SyncThreadOne extends Thread{

    SyncDisplayMethod dat1;

    SyncThreadOne(SyncDisplayMethod t1){
        dat1=t1;
    }

    @Override
    public void run() {
        dat1.display("hello world sssssssssssssssssssssssssssss");
    }
}
