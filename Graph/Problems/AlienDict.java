import java.util.*;

public class AlienDict {
    public static List<Integer> toposort(List<List<Integer>> adj , int k){
        int[] indeg = new int[k];
        for(int i=0;i<k;i++){
            for(int it:adj.get(i)){
                indeg[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<k;i++){
            if(indeg[i]==0) q.add(i);
        }
        List<Integer> topo = new ArrayList<>();
        while(q.size()>0){
            int val = q.remove();
            topo.add(val);
            for(int it:adj.get(val)){
                indeg[it]--;
                if(indeg[it]==0) q.add(it);
            }
        }
        return topo;
    }
    public static void main(String[] args) {
        String[] dict = {"baa","abcd","abca","cab","cad"};
        int k = 4;
        int n = 5;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<k;i++) adj.add(new ArrayList<>());

        for(int i=0;i<n-1;i++){
            String s1 = dict[i];
            String s2 = dict[i+1];

            int len = Math.min(s1.length(), s2.length());
            for(int j=0;j<len;j++){
                if(s1.charAt(j) != s2.charAt(j)){
                    adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }
        System.out.println(adj);
        List<Integer> topo = toposort(adj,k);
        String ans = "";
        for(int it:topo){
            ans = ans + (char)(it + (int)'a');
        }
        System.out.println(ans);
        
    }
}
