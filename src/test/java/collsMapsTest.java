import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class collsMapsTest {

    public static void main(String[]args){

        Map<String ,String> linkedHM= new LinkedHashMap<>();


        linkedHM.put("FirstName","Vidyasagar");
        linkedHM.put("FirstName1","Vidyasagar");
        linkedHM.put("LastName","Sagar");


        for(Map.Entry<String,String> mm: linkedHM.entrySet()){
            System.out.println(mm.getKey()+" "+ mm.getValue());
        }

        Map<String,Map<String,String> > parentMap= new LinkedHashMap<>();
        HashMap<String,String> hm=new HashMap<>();

        hm.put("last_Name","reddy");
        hm.put("last_Name1","rr");
        hm.put("first_Name","ramireddy");

        parentMap.put("parent",hm);

        for(Map.Entry<String,String > nc : hm.entrySet()){

            System.out.println(nc.getKey()+" "+nc.getValue());
        }


        for(Map.Entry<String,Map<String,String>> mm: parentMap.entrySet()){
            System.out.println(mm.getKey()+" "+mm.getValue());
            for(Map.Entry<String,String> cc: mm.getValue().entrySet()){
                System.out.println(cc.getKey()+" "+ cc.getValue());
            }
        }
    }

}
