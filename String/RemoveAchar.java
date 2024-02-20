public class RemoveAchar {
    public static void main(String[] args) {
        String s = "abcax";
//Remove 'a' char
        String ans = " ";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != 'a')
            {
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);

//Reverse a String;
        String st = "Shahb";
        int n = st.length()-1;
        String an = "";

        for(int i=n;i>=0;i--)
        {
            an = an+st.charAt(i);
        }

        System.out.println(an);
    }
}
