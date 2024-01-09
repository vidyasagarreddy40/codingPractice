package finalPract.multiThreadingPract;

public class SyncMainToRun {
    public static void main(String[] args) {
        SyncDisplayMethod d = new SyncDisplayMethod();
        SyncThreadOne t1 = new SyncThreadOne(d);
        SyncThreaTwo t2 = new SyncThreaTwo(d);
        t1.start();
        t2.start();
    }
}
