public class BasicString {
    public static void main(String[] args) {
        // //String to char array
        // String st = "SHahbaz";
        // char[] ch = st.toCharArray();
        // for(char c:ch)
        // {
        //     System.out.print(c+" ");
        // }
        // System.out.println();

        // //Char Array to String
        // char[] name ={'K','H','A','N'};
        // String s = new String(name);
        // System.out.println(s);

        // //String to Int
        // String s1 = "908";
        // int a = Integer.parseInt(s1);
        // System.out.println(a);

        // //Int to String

        // int n = 786;
        // String s2 = Integer.toString(n);    
        // System.out.println(s2);

        // //index of;
        // String stq = "abcde";
        // char ch1 = 'd';
        // int idx = stq.indexOf(ch1);
        // System.out.println(idx);
        // System.out.println(stq.indexOf('b'));
        String s = "bab";
        String t = "aba";
        StringBuilder s1 = new StringBuilder(s);
        int count = 0;
        for(int i=0;i<s1.length();i++){
            char ch = t.charAt(i);
            int idx = s.indexOf(ch);
            if(idx >= 0){
                s1.setCharAt(idx,'*');
            }
            else count++;
        }

    }
}
