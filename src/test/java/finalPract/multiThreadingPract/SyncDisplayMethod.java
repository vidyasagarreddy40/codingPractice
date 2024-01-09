package finalPract.multiThreadingPract;

public class SyncDisplayMethod {

    public synchronized void display(String s){
       // synchronized (this) {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
     //   }
    }
}
