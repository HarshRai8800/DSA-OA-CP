import java.util.*;

public class Q_37{
    public static void main(String args[]){
        int nums[] = {10, 1, 9, 2, 8, 3};
        int n = nums.length;

        int pairs =0;

        // brute force
        // for(int i=0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         for(int k = j+1;k<n;k++){
        //             if(nums[i]>nums[j]&&nums[j]<nums[k])pairs++;
        //         }
        //     }
        // }

        // optimal with O(N^2) space and time complexity

        // int pref[] = new int[n];
        // int suf[] = new int[n];

        // for(int i=0;i<n;i++){
        //     int c = 0;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]<nums[j])c++;
        //     }
        //     suf[i] = c;
        // }

        // for(int i=0;i<n;i++){
        //     int c = 0;
        //     for(int j=i-1;j>=0;j--){
        //         if(nums[i]<nums[j])c++;
        //     }
        //     pref[i] = c;
        // } 

        // for(int i=0;i<n-1;i++){
        //     pairs += suf[i]*pref[i];
        // }

        // System.out.println(pairs);

    //    Now for four variables I , J , K , L

        int pref[] = new int[n];
        int suf[] = new int[n];

        for(int k=0;k<n;k++){
            int c = 0;
            for(int l=k+1;l<n;l++){
                if(nums[k]>nums[l])c++;
            }
            suf[k] = c;
        }

        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=i-1;j>=0;j--){
                if(nums[i]<nums[j])c++;
            }
            pref[i] = c;
        } 

        int quadraples = 0;

        for(int j=0;j<n;j++){
           for(int k = j+1;k<n;k++){
                if(nums[j]<nums[k])quadraples += pref[j]*suf[k];
           }
        }

        System.out.println(quadraples);


    }
}