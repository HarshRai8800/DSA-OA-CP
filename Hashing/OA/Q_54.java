import java.util.*;

public class Q_54{
    public static void main(String args[]){
        int nums[] = {9,3,1,2,3,9,10};
        int n = nums.length;

        HashMap<String,Integer>map = new HashMap<>();
        int totalSum = 0;
        int counter = 0;
        for(int i=0;i<n;i++){
            totalSum += nums[i];
            int check = totalSum - (2*nums[i]);
            String str = ""+check+nums[i];
            if(map.containsKey(str)){
                counter += map.get(str);
            }
            map.put(""+totalSum+nums[i],map.getOrDefault(""+totalSum+nums[i],0)+1);
        }

        System.out.println(counter);

    }
}