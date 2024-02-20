import java.util.*;
class Pair{
    String first;
    int second;
    public Pair(String first,int second){
        this.first = first;
        this.second = second;
    }
}
public class WordLadderI {
    public static void main(String[] args) {
       String beginWord = "hit", endWord = "cog";
       String[] wordList = {"hot","dot","dog","lot","log","cog"};

       Queue<Pair> q = new LinkedList<>();
       q.add(new Pair(beginWord, 1));
       
       Set<String> h = new HashSet<>();
       for(String s:wordList) h.add(s);
       h.remove(beginWord);

       while (!q.isEmpty()){
        String word = q.peek().first;
        int step = q.peek().second;
        q.remove();
        if(endWord.equals(word)) System.out.println(step);
        for(int i=0;i<word.length();i++){
            for(char ch='a';ch<='z';ch++){
                char[] rep = word.toCharArray();
                rep[i] = ch;
                String newword = new String(rep);
                if(h.contains(newword)){
                    h.remove(newword);
                    q.add(new Pair(newword, step+1));
                }
            }
         }
       }
       System.out.println(0);
    }
}
