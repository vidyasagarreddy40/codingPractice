package finalPract;

import java.util.Arrays;

public class sorting {

    public static void main(String[] args) {


        int[] numbers = {99, 20, 0, 45, 8, -1, 3};

        Arrays.sort(numbers);

        Arrays.stream(numbers).forEach(System.out::println);

        int[] numbers2 = {99, 22, 0, 45, 8, -2, 3};

        Arrays.stream(numbers2).sorted().forEach(System.out::println);

        int[] arr = {99, 32, 0, 555, 8, -6, 9, 1};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                int temp=0;

                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            System.out.print(arr[i]+" ");
        }

    }
}
