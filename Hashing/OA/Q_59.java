import java.util.*;

public class Q_59{
    public static void main(String args[]){
        int nums[] = {1,1,1,2};
        int n = nums.length;
        int k = 0;
        System.out.println(findPairs(nums,n,k));

    }
    public static int findPairs(int nums[],int n,int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        int pairs = 0;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(HashMap.Entry<Integer,Integer>entry:map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();

            if(k==0){
                if(val>1){
                    pairs++;
                }
            }else{
                if(map.containsKey(key+k)){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}