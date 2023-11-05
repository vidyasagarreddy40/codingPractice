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

        HashMap<String,String> hm=new HashMap<>();

        hm.put("last_Name","reddy");
        hm.put("last_Name1","rr");
        hm.put("first_Name","ramireddy");

        for(Map.Entry<String,String > nc : hm.entrySet()){

            System.out.println(nc.getKey()+" "+nc.getValue());
        }

    }

}
