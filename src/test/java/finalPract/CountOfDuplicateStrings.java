package finalPract;

import java.util.HashMap;

public class CountOfDuplicateStrings {

    public static void main(String[]args){

        String param="hello hi how are you ? where are you ?";

        String[] ar= param.split(" ");
        HashMap<String, Integer> map= new HashMap<>();

        for(int i=0;i<ar.length;i++){

            if(map.containsKey(ar[i])){
                map.put(ar[i],map.get(ar[i])+1);
            }else{
                map.put(ar[i],1);
            }
        }

        System.out.println(map);
    }
}
