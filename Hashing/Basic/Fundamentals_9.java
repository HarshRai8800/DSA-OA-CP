import java.util.*;

public class Fundamentals_9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int prefix = 0;
        HashMap<Integer,Integer>smallest = new HashMap<>();
        smallest.put(0,-1);
        HashMap<Integer,Integer>largest = new HashMap<>();
        largest.put(0,-1);

        int smallCount = 0;
        int largeCount = 0;
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;


        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            prefix = prefix+x;
            int key = prefix-k;
            
            if(smallest.containsKey(key)){
                int currS = i-smallest.get(key);
                if(currS<s){
                s = currS;
                smallCount = 1;
                }else if(currS==s){
                    smallCount++;
                }
            }
            smallest.put(prefix,i);
            if(largest.containsKey(key)){
                int currL = i-largest.get(key);
                if(currL>l){
                l = currL;
                largeCount = 1;
                }else if(currL==l)largeCount++;
            }
            largest.putIfAbsent(prefix,i);
        }

        if (s == Integer.MAX_VALUE) s = -1;
        if (l == Integer.MIN_VALUE) l = -1;

        System.out.println("Smallest subArray length is :"+s+" with count "+smallCount);
        System.out.println("Largest subArray length is :"+l+" with count "+largeCount);
    }
    1 -1 5 -2 3 1
}