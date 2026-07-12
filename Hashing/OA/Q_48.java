import java.util.*;

public class Q_48{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int pairs = 0;


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int k = nums[i]+nums[j];
                pairs = Math.max(pairs,maxOperations(nums,k));
            }
        }
        System.out.println(pairs);

    }
    public static int maxOperations(int[] nums, int k) {

        HashMap<Integer,Integer>map = new HashMap<>();
        HashMap<Integer,Integer>used = new HashMap<>();

        int n = nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int pairs = 0;

        for(int i=0;i<n;i++){
            int check = k-nums[i];
            if(used.getOrDefault(nums[i],0)==0&&used.getOrDefault(nums[i],0)==0){
                if(nums[i]==check){
                    pairs += map.get(nums[i])/2;
                }else{
                    pairs += Math.min(map.get(nums[i]),map.getOrDefault(check,0));
                }
            }

            used.put(nums[i],1);
            used.put(check,1);
        }
        return pairs;
    }
}