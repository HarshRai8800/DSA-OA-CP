import java.util.*;

public class Q_33{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int nums[] = new int[n+2];
        int prefixSum[] = new int[n+2];

        for(int i=1;i<=n;i++){
            nums[i] = sc.nextInt();
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }

        int suffixSum[] = new int[n+2];

        for(int i=n;i>=1;i--){
            suffixSum[i] = suffixSum[i+1]+nums[i];
        }
        int sum = 0;

        for(int i=k;i>=0;i--){
            sum = Math.max(sum,prefixSum[i]+suffixSum[n-(k-i)+1]);
        }

        System.out.println(sum);
    }
}