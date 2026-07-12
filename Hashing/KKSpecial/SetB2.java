import java.util.*;

public class SetB2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map = new HashMap<>();
        int prefix = 0;
        int size = 100000;
        map.put(0,-1);

        for(int i=0;i<n;i++){
            prefix += arr[i];

            int target = prefix - k;
            if(map.containsKey(target)){
                size = Math.min(size,i-map.get(target));
            }
            map.put(prefix,i);
        }

        System.out.println(size);
}
}