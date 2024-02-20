import java.util.*;
public class BasicFunctions {
    public static void main(String[] args) {
        hashmap();
    }
    public static void hashmap(){
        HashMap<String,Integer> h = new HashMap<>();
        h.put("Akash",21);
        h.put("shs",h.getOrDefault("sh", 0)+1);
        h.put("Yash",16);
        h.put("Lavanya",17);
        h.put("Rishika",19);
        h.put("Harry",18);
        System.out.println(h);
        //Get a value using key
        // System.out.println(h.get("Yash"));
        // //Updating the value
        // h.put("Yash",34);
        // System.out.println(h);
        // //dont want to change value means constant rkhne hai
        // h.putIfAbsent("Yash", 21);
        
        // System.out.println(h);
        // //Removing a pair
        // h.remove("Rishika");
        // System.out.println(h);
        // //Checking a key is in Hashmap
        // System.out.println(h.containsKey("Yash"));
        // System.out.println(h.containsValue(19));
        // //Get only Keys
        // System.out.println(h.keySet());
        // //Get only Values
        // System.out.println(h.values());
        // //Get only Entries
        // System.out.println(h.entrySet());
        

        //Traversing on Hashmap
        for(var i:h.keySet()) System.out.println(i); 
        for(String i:h.keySet()){
            System.out.print(h.get(i)+" ");
        }
        for(var i:h.values()) System.out.println(i);
        for(var i:h.entrySet()) System.out.println(i.getKey());
        for(var i:h.entrySet()) System.out.println(i.getValue());
        
    }
    
}
