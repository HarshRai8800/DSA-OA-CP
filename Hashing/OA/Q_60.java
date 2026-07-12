import java.util.*;

public class Q_60{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long max1 = Integer.MIN_VALUE;
        long max2 = Integer.MIN_VALUE;
        long max3 = Integer.MIN_VALUE;
        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;
        

        for(int i=0;i<n;i++){
            long val1 = i+a[i];
            long val2 = a[i]-i;
            long val3 = i-a[i];
            
            max1 =Math.max(max1,val1);
            max2 = Math.max(max2,val2);
            max3 = Math.max(max3,val3);
            min1 = Math.min(min1,val1);
            min2 = Math.min(min2,val2);
        }

        long ans = Integer.MIN_VALUE;

        ans = max1-2*min1;
        ans = Math.max(ans,max2-2*min2);
        ans = Math.max(ans,2*max2+max3);
        ans = Math.max(ans,2*max1-min1);
        System.out.println(ans);
    }
}