package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(0,"String1");
        hm.put(1,"String2");
        hm.put(1,"String3");
        hm.put(3,"String4");
        ArrayList<String> ar=new ArrayList<String>();
        ar.add(0,"soumya1");
        ar.add(1,"sridhar1");
        ar.add(1,"sundeep1");
        ar.add(2,"abc");
        System.out.println("Hashmap value is :"+hm.get(1));
        System.out.println("Arraylist value is :"+ar.get(1));

        System.out.println(hm.keySet().size());
        for(String ar1:ar){
            System.out.println(ar1);
        }
       for(Map.Entry me:hm.entrySet()){
           System.out.print(me.getKey());
           System.out.println("  :"+me.getValue());

       }
    }
}
