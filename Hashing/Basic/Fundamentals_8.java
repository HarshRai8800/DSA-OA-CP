import java.util.*;

public class Fundamentals_8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int prefix = 0;
        HashMap<Integer,Integer>smallest = new HashMap<>();
        smallest.put(0,-1);
        HashMap<Integer,Integer>largest = new HashMap<>();
        largest.put(0,-1);
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;


        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            prefix = prefix+x;
            int key = prefix-k;
            
            if(smallest.containsKey(key)){
                s = Math.min(s,i-smallest.get(key));
            }
            smallest.put(prefix,i);
            if(largest.containsKey(key)){
                l = Math.max(l,i-largest.get(key));
            }
            largest.putIfAbsent(prefix,i);
        }

        if (s == Integer.MAX_VALUE) s = -1;
        if (l == Integer.MIN_VALUE) l = -1;

        System.out.println("Smallest subArray length is :"+s);
        System.out.println("Largest subArray length is :"+l);
    }
}