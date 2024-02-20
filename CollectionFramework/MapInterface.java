import java.util.*;
public class MapInterface {

    public static void treemap(){
        TreeMap<Integer,String> h = new TreeMap<>();    //Sorted order 
        h.put(1, "shah");
        h.put(3, "Khan");
        h.put(4,"Ali");
        h.put(2, "baz");
        h.put(5, "shah");
        System.out.println(h);
        h.putIfAbsent(1, "abx");
        System.out.println(h);
        System.out.println(h.get(2));

        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue("shah"));

        System.out.println(h.entrySet());
        System.out.println(h.keySet());
        System.out.println(h.values());

        for(var i:h.keySet()) System.out.print(i+" ");
        for(var i:h.values()) System.out.print(i + " ");
        System.out.println();
        for(var i:h.entrySet()) System.out.print(i + " ");
        System.out.println();
        for(var i:h.entrySet()) System.out.println(i.getValue());
        for(var i:h.entrySet()) System.out.println(i.getKey());
    }
    public static void main(String[] args) {
        // haspmapexample();
        linkedhasmap();
        // treemap();
    }
    public static void haspmapexample(){
        HashMap<Integer,String> hm = new HashMap<>();  //Unordered
        hm.put(4, "shah");
        hm.put(1,"Rohan");
        hm.put(9,"khan");
        hm.put(3, "Aman");
        hm.put(2,"Riya");
        // hm.put(1, "shah");  //Overrides
        hm.putIfAbsent(1, "shah"); //Not overrides
        System.out.println(hm);

        // System.out.println(hm.get(2));

        // System.out.println(hm.containsKey(4));
        // System.out.println(hm.containsValue("Aman"));

        // System.out.println(hm.entrySet());
        // System.out.println(hm.keySet());
        System.out.println(hm.values());

        //Iterate across keys

        for(var i : hm.keySet()){
            System.out.println(i);
        }

        //Iterate over values
        for(var i : hm.values()){
            System.out.println(i);
        }

        //Iterate over key,value mapping
        for(var i: hm.entrySet()){
            System.out.println(i);
        }
        //only value
        for(var i:hm.entrySet()){
            System.out.println(i.getValue());
        }
    }
    public static void linkedhasmap(){
        LinkedHashMap<Integer,String> h = new LinkedHashMap<>();   //Ordered 
        h.put(1, "shah");
        h.put(3, "Khan");
        h.put(4,"Ali");
        h.put(2, "baz");
        System.out.println(h);
        
        h.putIfAbsent(1, "abx");
        System.out.println(h);
        System.out.println(h.get(2));

        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue("shah"));

        System.out.println(h.entrySet());
        System.out.println(h.keySet());
        System.out.println(h.values());

        for(var i:h.keySet()) System.out.print(i+" ");
        for(var i:h.values()) System.out.print(i + " ");
        System.out.println();
        for(var i:h.entrySet()) System.out.print(i + " ");
        System.out.println();
        for(var i:h.entrySet()) System.out.println(i.getValue());
        for(var i:h.entrySet()) System.out.println(i.getKey());
    }
}
