import java.util.*;

public class Q_58{
    public static void main(String args[]){
        int nums[] = {15,-10,-15,100,15,-1000,15};
        int n = nums.length;

        HashMap<Integer,Integer>map = new HashMap<>();
        int totalSum = 0;
        int ans = Integer.MIN_VALUE;
        //if nums[i]>=0
        // for(int i=0;i<n;i++){
        //     totalSum+=nums[i];
        //     if(map.containsKey(nums[i])){
        //         int prevSum = map.get(nums[i]);
        //         int currSum = totalSum-prevSum+nums[i];
        //         ans = Math.max(ans,currSum);
        //     }
        //     map.put(nums[i],map.getOrDefault(nums[i],totalSum));
        // }

        //if nums[i] can be <0

        for(int i=0;i<n;i++){
            int val = nums[i];
            ans = Math.max(ans,val);

            if(map.containsKey(val)){
                int subArrSum = map.get(val);
                ans = Math.max(ans,totalSum-subArrSum+val);

                map.put(val,Math.min(subArrSum,totalSum));
            }else{
                map.put(val,totalSum);
            }
            totalSum+=val;
        }

        System.out.println(ans);
    }
}