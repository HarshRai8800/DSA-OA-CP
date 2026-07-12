import java.util.*;

public class Q_52{
    public static void main(String args[]){
        int nums[] = {5,-8,1,1,5};
        int n = nums.length;
        secondSubArrayShouldBeStrictlyIncreasing(nums,n);
    }

    public static void secondSubArrayShouldBeStrictlyIncreasing(int nums[],int n){
        
        int prefix[] = new int[n];
        prefix[0] = nums[0];

        for(int i=1;i<n;i++){
            prefix[i] = Math.max(nums[i],prefix[i-1]+nums[i]);
        }

        int suff = nums[n-1];
        int maxy[] = new int[n];
        maxy[n-1] = nums[n-1];

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                suff = Math.max(suff+nums[i],nums[i]);
                maxy[i] = Math.max(suff,maxy[i+1]);
            }else{
                suff = nums[i];
                maxy[i] = Math.max(maxy[i+1],suff);
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=0;i<n-1;i++){
                max = Math.max(max,prefix[i]+maxy[i+1]);
        }

        System.out.println(max);
    }

    public static void maxSubAaraySumNonOverLapping(int nums[],int n){

        int prefix[] = new int[n];
        prefix[0] = nums[0];

        for(int i=1;i<n;i++){
            prefix[i] = Math.max(nums[i],prefix[i-1]+nums[i]);
        }

        int suff = nums[n-1];
        int maxy[] = new int[n];
        maxy[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suff = Math.max(nums[i],nums[i]+suff);
            maxy[i] = Math.max(maxy[i+1],suff); 
        }

        int max = 0;

        for(int i=0;i<n-1;i++){
                max = Math.max(max,prefix[i]+maxy[i+1]);
        }

        System.out.println(max);

    }

    public static void maxSubAaraySumTillI(int nums[],int n){

        int prefix[] = new int[n];
        prefix[0] = nums[0];
        System.out.println("Max SubArray ending with element 0 = "+prefix[0]);

        for(int i=1;i<n;i++){
            prefix[i] = Math.max(nums[i],prefix[i-1]+nums[i]);
            System.out.println("Max SubArray ending with element "+i +" = "+prefix[i]);
        }

    }
}