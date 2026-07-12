import java.util.*;

public class Fundamentals_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map = new HashMap<>();
        int count = 0;

        for(int i=0;i<n;i++){
            int val = arr[i];
            int key1 = k+val;
            int key2 = val-k;
            if(map.containsKey(key1)){
                count+=map.get(key1);
            }
            else if(map.containsKey(key2)){
                count+=map.get(key2);
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }

       System.out.println("No of pairs found are : "+count);
    }
}