// package String;

public class Substring {
    public static void main(String[] args) {
        String str1 = "attap";
        // System.out.println(str1 +10+20);
        // System.out.println(str1 +(10+20));

//Print subString
        // for(int i=0;i<str1.length();i++)
        // {
        //     for(int j=i+1;j<str1.length()+1;j++)
        //     {
        //         System.out.println(str1.substring(i, j));
        //     }
        // }

//Check Palindrone
        boolean value = checkpalindrone(str1);
        System.out.println(value);
        
    }

    public static boolean checkpalindrone(String str1)
    {
        int n = str1.length();
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            if(str1.charAt(s)==str1.charAt(e))
            {
                s++;
                e--;
            }
            else
            {
                return false;
            }
        }
        return true;
        
    }
}
