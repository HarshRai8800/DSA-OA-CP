import java.util.*;

public class Q_32{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n+1];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map = new HashMap<>();
        int count = 0;

        for(int i=1;i<=n;i++){
            int val = nums[nums[nums[i]]];

            if(map.containsKey(val)){
                count =count+map.get(val); 
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }

        System.out.println(count);
    }
}