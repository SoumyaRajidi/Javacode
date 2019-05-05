package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemoString {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("Testcase Name","login page");
        hm.put("browser","googlechrome");
        hm.put("url","yahoo.com");
        //hm.put(3,"String4");

       for(Map.Entry me:hm.entrySet()){
           System.out.println("Brfore removal :"+me.getKey());
           System.out.println("before removal value :"+me.getValue());
           if(me.getKey().equals("browser")){
               System.out.println("value at if cond "+me.getValue());
           }

       }
       hm.remove("url");
        for(Map.Entry me:hm.entrySet()){
            System.out.println("after removal key :"+me.getKey());
            System.out.println("after removal value :"+me.getValue());
            if(me.getKey().equals("browser")){
                System.out.println("value at if cond "+me.getValue());
            }

        }



    }
}
