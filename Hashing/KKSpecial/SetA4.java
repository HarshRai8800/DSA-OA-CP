import java.util.*;

public class SetA4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int maxElm = 0;

        
        for(int i=0;i<n;i++){
            maxElm = Math.max(maxElm,map.get(arr[i]));
        }


        System.out.println(n-maxElm);
    }
}