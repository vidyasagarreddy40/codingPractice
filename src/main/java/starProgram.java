public class starProgram {

    public static void main(String[]args){

        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println(" ======================= ");
        System.out.println(" ======================= ");

        for(int x=5;x>=0;x--){
            for(int y=x;y>=0;y--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
