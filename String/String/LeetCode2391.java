
public class LeetCode2391{
    public static void main(String[] args) {
        String[] garbage = {"G","M","P"};
		int[] travel = {1,3};
	    int ans = 0;
        int var = 0;
        //for G
        for(int i=0;i<garbage.length;i++){
            StringBuilder sb = new StringBuilder(garbage[i]);
            if(sb.indexOf("G") >= 0){
                int c = 0;
                for(int j=0;j<sb.length();j++){
                    if(sb.charAt(j)=='G') c++;
                }
                ans+=c;
                if(i!=0) ans+=travel[i-1]+var;
                var=0;
            }
            else{
                if(i!=0){
                  var+=travel[i-1]; 
                }
            }
        }
        var=0;
        // For M
        for(int i=0;i<garbage.length;i++){
            StringBuilder sb = new StringBuilder(garbage[i]);
            if(sb.indexOf("M") >= 0){
                int c = 0;
                for(int j=0;j<sb.length();j++){
                    if(sb.charAt(j)=='M') c++;
                }
                ans+=c;
                if(i!=0) ans+=travel[i-1];
                var=0;
            }
            else{
                if(i!=0){
                  var+=travel[i-1]; 
                }
            }
        }
        var=0;
        System.out.println(ans);
        //For P
        for(int i=0;i<garbage.length;i++){
            StringBuilder sb = new StringBuilder(garbage[i]);
            if(sb.indexOf("P") >= 0){
                int c = 0;
                for(int j=0;j<sb.length();j++){
                    if(sb.charAt(j)=='P') c++;
                }
                ans+=c;
                if(i!=0) ans+=travel[i-1]+var;
                var=0;
                System.out.println(ans);
            }
            else{
                if(i!=0){
                   var+=travel[i-1]; 
                }
            }
        }
        
    }
}