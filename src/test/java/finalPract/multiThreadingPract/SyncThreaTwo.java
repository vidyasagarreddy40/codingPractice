package finalPract.multiThreadingPract;

public class SyncThreaTwo extends Thread {

    SyncDisplayMethod dat2;

    SyncThreaTwo(SyncDisplayMethod t2){
        dat2=t2;
    }

    @Override
    public void run() {
        dat2.display("how are you uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }
}
