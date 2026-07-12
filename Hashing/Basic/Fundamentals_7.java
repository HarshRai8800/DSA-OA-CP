import java.util.*;

public class Fundamentals_7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int prefix = 0;
        int arr[] = new int[n+1];
        HashMap<Integer,Integer>map = new HashMap<>();

        int count = 0;
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
            prefix = prefix+arr[i];

            int key = prefix-k;
            if(map.containsKey(key)){
                count+=map.get(key);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }

        System.out.println(count);
    }
}