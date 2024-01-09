public class matrix {


    public static void main(String[] args) {
        int matix[][] = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < matix.length; i++) {
            for (int j = 0; j < matix.length; j++) {
                System.out.print(matix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");

        for (int i = 0; i < matix.length; i++) {
            for (int j = 0; j < matix.length; j++) {
                System.out.print(matix[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");

        for (int i = matix.length - 1; i >= 0; i--) {
            for (int j = matix.length - 1; j >= 0; j--) {
                System.out.print(matix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");

        for (int i = matix.length - 1; i >= 0; i--) {
            for (int j = matix.length - 1; j >= 0; j--) {
                System.out.print(matix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
