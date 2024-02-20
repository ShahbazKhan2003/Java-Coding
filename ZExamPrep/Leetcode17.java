import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class pair{
    String food;
    String cuisines;
    int rate;
    public pair( String food,String cuisines,int rate){
        this.food = food;
        this.cuisines = cuisines;
        this.rate = rate;
    }
}
public class Leetcode17 {
    public static void main(String[] args) {
        String[] food = {"kimchi", "ziso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] rating = {9, 12, 8, 15, 14, 7};
        
        List<pair> p = new ArrayList<>();
        for(int i=0;i<food.length;i++) p.add(new pair(food[i], cuisines[i], rating[i]));
        Collections.sort(p,(a,b)->{
            if(a.rate == b.rate) return a.food.compareTo(b.food);
            else return b.rate - a.rate;
        });


        

        String check = "japanese";
        String ans = "";
        for(int i=0;i<p.size();i++){
            pair pp  = p.get(i);
            if(pp.cuisines.equals(check)){
                ans = pp.food; 
                break;
            }
        }

        System.out.println(ans);
    }
}
