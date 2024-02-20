public class ProblemPrintPalinddronicSubsring {

    //Print palidronic Substring
    public static void main(String[] args) {
        String st = "nitin";
        printpalindronesubstring(st);
    }


    public static void printpalindronesubstring(String st)
    {
        int count =0;
        for(int i=0;i<st.length();i++)
        {
            for(int j=i+1;j<st.length()+1;j++)
            {
                String store = st.substring(i, j);
                boolean check = checkpali(store);
                if(check)
                {
                    System.out.println(store);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean checkpali(String store)
    {
        int n = store.length();
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            if(store.charAt(s)==store.charAt(e))
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
