public class QSubsOrder {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();

        // for(int i=0;i<Math.pow(2, n);i++){
        //     String sub = "";
        //     for(int j=0;j<n;j++){
        //         if((i & 1 << j) != 0){
        //             sub+=s.charAt(j);
        //         }
        //     }
        //     if(sub.length() > 0){
        //         System.out.println(sub);
        //     }
        // }

        for(int i=0;i<Math.pow(2, n);i++){
            String sub = "";
            for(int j=0;j<n;j++){
                if((i&1 << j)!=0){
                    sub+=s.charAt(j);
                }
            }
            if(sub.length()>0){
                System.out.println(sub);
            }
        }

    }
}
