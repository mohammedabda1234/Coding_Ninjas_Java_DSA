package Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class InBuildMapUse {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("abc",1);
        map.put("def",3);
        //presence
        if (map.containsKey("abc")){
            System.out.println("map has abc");
        }else {
            System.out.println("map has abc1");
        }
        map.put("abc",4);//just increasing value (we have already key )
        // size
        System.out.println(map.size());
        // get value
        int v = map.get("abc");
        System.out.println(v);

//        int v1 = map.get("abc1");//get null pointer not have this value
//        System.out.println(v1);
        // remove
//        map.remove("abc");
//        if (map.containsKey("abc"))
//            System.out.println("map has abc");

        // iterate
         Set<String> key =  map.keySet();
         for (String s:key){
             System.out.print(s+" , ");
         }
    }
}
