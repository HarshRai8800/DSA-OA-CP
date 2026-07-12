import java.util.*;

public class Q_39{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str[] = new String[n];

        int [][] map = new int[100001][27];

        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }

        int ans[] = new int[n];

        for(int j = n-1;j>=0;j--){
            int sum = 0;
            String s = str[j];
            for(int i=0;i<s.length();i++){
                int ch = (int)(s.charAt(i)-'a');
                sum+= map[ch][i];
                map[ch][i]++;    
            }
            ans[j] = sum;
        }

        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}