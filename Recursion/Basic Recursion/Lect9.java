import java.util.*;
public class Lect9 {
    public static void main(String[] args) {
// Return All SubSequences 
        String s = "abc";
        ArrayList<String> ans = getSSQ(s);
        System.out.println(ans);   
//Print SubSequences
        printSSQ(s,"");

        // Sum of all Subsets in a array

        

    }

    public static ArrayList<String> getSSQ(String s)
    {
        ArrayList<String> ans = new ArrayList<>();
        
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        
        
        char curr = s.charAt(0);
        
        ArrayList<String> smallans = getSSQ(s.substring(1));

        for(String ss:smallans)
        {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void printSSQ(String s,String currans)
    {   
        if(s.length() == 0){
            System.out.println(currans);
            return;
        }
        
        char ch = s.charAt(0);

        String remstring = s.substring(1);

        printSSQ(remstring, currans + ch);

        printSSQ(remstring, currans );
    }
}
