import java.net.SocketTimeoutException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class pattern {
    public static void main(String[] args) {
        int n = 5;

        // for(int i=0;i<n;i++)
        // {
        // for(int j=n-i;j>0;j--)
        // {
        // System.out.print("* ");
        // }
        // System.out.println("\n");
        // }

        // for(int i=1;i<=n;i++)
        // {
        // for(int spaces=n-i;spaces>0;spaces--)
        // {
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++)
        // {
        // System.out.print("*");
        // }
        // System.out.println("\n");
        // }

        // for (int i = 0; i < n; i++) {
        // for (int spaces = 0; spaces < 2 * i; spaces++) {
        // System.out.print(" ");
        // }
        // for (int j = n - i; j > 0; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for(int i=1;i<n;i++)
        // {
        // for(int spaces=n-i;spaces>0;spaces--)
        // {
        // System.out.print(" ");
        // }
        // for(int j=1;j<2*i;j++)
        // {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int k = n - i; k > 0; k--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int spaces = (2 * n - 2 - i); spaces > 0; spaces--) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
