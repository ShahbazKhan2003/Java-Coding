import java.util.*;
public class Stirng1{
    public static boolean iscb(int val){
        if(val==0 || val==1){
            return false;
        }
        if(val==2){
            return true;
        }
        if(val%2!=0){
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
	  String s="81615";
      int cnt=0;
	  //char arr[]={'a','b','c'};
	  for(int len=1;len<=s.length();len++){
	      for(int i=0;i<=s.length()-len;i++){
	          String k=s.substring(i,i+len);
	          //System.out.println(s.substring(i,i+len));
	           if(iscb(Integer.parseInt(k))){
	               cnt++;
	           }
	      }
	  }
	  System.out.println(cnt);
	}
}