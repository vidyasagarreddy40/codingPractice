package prac2;

import java.util.*;

public class collpratice {

    public static void main(String[]args)
    {
        int[]ar={3,6,1,0,-1,45};
        //System.out.println(Collections.sort(ar));
        Arrays.sort(ar);
        System.out.println(ar);

        String [] names={"sagar","reddy","sagar","reddy","vidyasgar"};

        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                if(names[i].equalsIgnoreCase(names[j])){
                  System.out.println(names[i]);
                }
            }
        }

        Set<String> set= new LinkedHashSet<>(Arrays.asList(names));
        System.out.println(set);




    }
}
