public class primeNumbersCheck {

    public static void main(String [] args){

        int num=100, count;

        for(int i=2;i<=num;i++){
            count=0;
            for(int j=1;j<=num;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
