import java.util.*;

public class Q_50{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        // int prefix[] = new int[n];

        // prefix[0] = 1;

        // for(int i=1;i<n;i++){
        //     if(nums[i]>nums[i-1]){
        //         prefix[i]  = prefix[i-1]+1;
        //     }else{
        //         prefix[i] = 1;
        //     }
        // }

        int suffix[] = new int[n];

        suffix[n-1] = 1;

        for(int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                suffix[i] = suffix[i+1]+1;
            }else{
                suffix[i] = 1;
            }
        }

        int max = 0;
        int prefix = 1;
        for(int i=1;i<n-1;i++){
            max = Math.max(max,(prefix)*(suffix[i]-1));
            if(nums[i]>nums[i-1]){
                prefix++;
            }else{
                prefix = 1;
            }
        }

        System.out.println(max);
    }
}