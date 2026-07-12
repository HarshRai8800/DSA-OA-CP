import java.util.*;

public class Q_42{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map = new HashMap<>();

        // For sortest array with first and last element sum ==k;

        int length = 100000;

        for(int i=0;i<n;i++){
            int a = nums[i];
            int b = k-a;

            if(map.containsKey(b)){
                length = Math.min(length,i-map.get(b)+1);
            }
            map.put(a,i);
        }

        System.out.println(length);

        map.clear();
        length = 0;
         for(int i=0;i<n;i++){
            int a = nums[i];
            int b = k-a;

            if(map.containsKey(b)){
                length = Math.max(length,i-map.get(b)+1);
            }
            map.put(a,map.getOrDefault(a,i));
        }

        System.out.println(length);



    }
}