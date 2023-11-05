package prac2;


import java.sql.SQLDataException;

public class p1 extends abclass implements intPr,nestedInt.message,nestedInt{

    final static int x;

    static {
        x = 11;
    }

    int add(int a, int b) throws SQLDataException {
        int x = a + b;
        return x;
    }


    public void sum(int a, long b) {
        int x = a + (int) b;
    }

    public void sum(long a, int b) {
        add();
    }

    public static void main(String[] args) {
        intPr.adding();

        nestedclass ns= new nestedclass();
        ns.runnning();
        nestedclass.walking nss= ns.new walking();

        nss.walk();


    }

    public void sub(final int d) {


    }


    @Override
    void run() {

    }

    @Override
    public void msg() {

    }


    @Override
    public void show() {

    }

    private void m1(){

    }
}
