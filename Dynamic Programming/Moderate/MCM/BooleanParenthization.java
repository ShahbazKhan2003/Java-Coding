import java.util.Scanner;

public class BooleanParenthization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int n = str1.length();
        int[][] dpt = new int[n][n];
        int[][] dpf = new int[n][n];

        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                if(g==0){
                    char ch = str1.charAt(i);
                    if(ch=='T'){
                        dpt[i][j] = 1;
                        dpf[i][j] = 0;
                    }
                    else{
                        dpt[i][j] = 0;
                        dpf[i][j] = 1;
                    }
                }
                else{
                    for(int k=i;k<j;k++){
                        char opr = str2.charAt(k);
                        int ltc = dpt[i][k];
                        int rtc = dpt[k+1][j];
                        int lfc = dpf[i][k];
                        int rfc = dpf[k+1][j];

                        if(opr == '&'){
                            dpt[i][j] += ltc * rtc;
                            dpf[i][j] += lfc * rtc + ltc * rfc + lfc * rfc;
                        }
                        else if(opr == '|'){
                            dpt[i][j] +=  ltc*rtc + lfc * rtc + ltc * rfc;
                            dpf[i][j] += lfc * rfc;
                        }
                        else{ //^
                            dpt[i][j] += ltc * rfc + lfc * rtc;   
                            dpf[i][j] += lfc * rfc + ltc * rtc;
                        }

                    }
                }
            }
        }
        System.out.println(dpt[0][n-1]);
    }
}
