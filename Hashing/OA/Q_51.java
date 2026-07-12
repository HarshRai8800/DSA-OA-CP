import java.util.*;

class Q_51{
    public static void main(String args[]){
        int nums[] = {5,4,3,8};
        int n = nums.length;
        optimal(nums,n);
        // bruteForce(nums,n);
    }

    static void optimal( int nums[],int n){

        int suffix[] = new int[n];
        suffix[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                suffix[i] = suffix[i+1]+1;
            }else{
                suffix[i] = 1;
            }
        }

        int prefix[] = new int[n];
        prefix[0] = 1;
        for(int i = 1;i<n;i++){
            if(nums[i-1]>nums[i]){
                prefix[i] = prefix[i-1]+1;
            }else{
                prefix[i] = 1;
            }
        }

        int count = 0;

        for(int i=1;i<n-1;i++){

            count +=(prefix[i]-1)*(suffix[i]-1);

        }

        System.out.println(count);

    }

    static void bruteForce(int nums[],int n){

        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(j-i>=2 && checkValley(i,j,nums)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
    static boolean checkValley(int i,int j,int nums[]){
        int bottom = nums[i];
        int id = i;

        for(int k=i;k<=j;k++){
            if(bottom>nums[k]){
                bottom = nums[k];
                id = k;
            }
        }

        if(id==i||id==j)return false;

        for(int k=i+1;k<=id;k++){
            if(nums[k]>=nums[k-1])return false;
        }

        for(int k = j-1;k>=id;k--){
            if(nums[k]>nums[k+1])return false;
        }
        return true;
    }
}