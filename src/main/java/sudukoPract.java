public class sudukoPract {

    public static void main(String[] args) {

        int numbers[][] = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9, 1},
                {4, 4, 5, 6, 7, 8, 9, 1, 2},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {5, 6, 7, 8, 9, 1, 2, 3, 4},
                {6, 7, 8, 9, 1, 2, 3, 4, 5},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {8, 9, 1, 2, 3, 4, 5, 6, 7},
                {1, 1, 2, 3, 4, 5, 6, 7, 8}};

        System.out.println(checkGrid(numbers));

    }

    public static Boolean checkGrid(int[][] a) {

        Boolean isTrue = false;

        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp = a[i][j];
                System.out.println(temp);
                for (int k = j + 1; k < a.length; k++) {
                    if (temp == a[i][k]) {
                        isTrue = true;
                        System.out.println(temp);
                    }

                    if(temp==a[k][i]){
                        isTrue = true;
                        System.out.println(temp);
                    }
                }
            }
        }
        return isTrue;
    }

}
