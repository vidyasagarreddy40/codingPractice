package finalPract;

import java.util.HashMap;

public class CountOfDuplicateChars {

    public static void main(String[]args){


        String word="vidyasagarreddy";

        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<word.length();i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
            else{
                map.put(word.charAt(i),1);
            }
        }
        System.out.println(map);
    }
}
