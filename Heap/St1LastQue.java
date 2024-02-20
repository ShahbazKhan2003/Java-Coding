import java.util.*;

public class St1LastQue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int search = -1;
        Map<String,Integer> h = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(s.charAt(0) >='A' && s.charAt(0) <='Z'){
                h.put(s, i);
                i++;
            }
            else search = Integer.parseInt(s);
        }
        System.out.println(h);
        PriorityQueue<Map.Entry<String,Integer>> p = new PriorityQueue<>((a,b)->{
            return b.getValue() - a.getValue();
        });
        p.addAll(h.entrySet());
        while (!p.isEmpty()) {
            var kk = p.poll();
            System.out.println(kk.getValue() + " " + kk.getKey());
        }
        String check = "not present";
        for(int it:h.values()){
            if(it == search) check = "present";
        } 
        System.out.println(check);

    }

}