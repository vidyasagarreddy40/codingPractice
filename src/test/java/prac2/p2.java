package prac2;

import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLTimeoutException;

public class p2  extends p1{

    public static void main(String[]args){
        p2 p= new p2();

        p.add(1,2);
       // p.sum(20,20);


    }

    @Override
    public int add(int a, int b)  {
        return a+b;
    }

    @Override
    public void sum(int a, long b) throws NullPointerException {
        super.sum(a, b);
        //super.add(a,(int)b);
    }

    @Override
   public void run() {
        super.run();
    }

    @Override
    public void msg() {
        super.msg();
    }
}
