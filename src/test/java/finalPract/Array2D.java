package finalPract;

public class Array2D {


    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("+++++++++++++++++++");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                System.out.print(ar[j][i]+" ");
            }
            System.out.println("");
        }

        System.out.println("+++++++++++++++++++");

        for(int i=ar.length-1;i>=0;i--){
            for(int j=ar.length-1;j>=0;j--){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("+++++++++++++++++++");

        for(int i=ar.length-1;i>=0;i--){
            for(int j=ar.length-1;j>=0;j--){
                System.out.print(ar[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
