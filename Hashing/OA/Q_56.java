import java.util.*;

public class Q_56{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int stockPrices[] = new int[n];

        for(int i=0;i<n;i++){
            stockPrices[i] = sc.nextInt();
        }

        getMaximumScore(stockPrices,n);
    }

    public static void getMaximumScore(int stockPrices[],int n){
        HashMap<Integer,Long>map = new HashMap<>();

        long maxSum = 0;

        for(int i=0;i<n;i++){
            int key = stockPrices[i]-i;
            map.put(key,map.getOrDefault(key,0L)+stockPrices[i]);
            maxSum = Math.max(maxSum,map.get(key));
        }

        System.out.println(maxSum);
    }
}