public class continuebreakreturn {

    public static void main(String[] args) {

        int x = 1;

        System.out.println(x);

        for (int i = 0; i <= 10; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
            if (i == 8) {
                break;
            }
        }

        int num=10;
        String name="sagar";

        System.out.printf(" number = %d , name= %s", num,name);

        getNum(2);

        if (x == 1) {
            return;
        }

        System.out.println(x);
    }

    public static int getNum(int x) {

        if (x == 2) {
            return x;
        }
        System.out.println(x);

        return x;
    }
}
