public class fibanocci {

    public static void main(String [] args){
        int n=9,a=0,b=1,temp=0;

        System.out.println(a+" "+b);

        for(int i=1;i<=n;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print (" "+temp);
        }

    }
}
