import java.util.*;
public class maxfreqString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int count=0;
        char value='0';
        int n=st.length();
        if(n==1)
        {
            System.out.println(st.charAt(0));
        }
        else
        {
		for(int i=0;i<st.length();i++)
		{
			int ans=0;
			for(int j=i+1;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
					ans++;
                    if(count<ans)
                    {
                        count=ans;
                        value=st.charAt(i);
                    }
				}
			}
		}
        System.out.println(value);
    }
        
    }
}
