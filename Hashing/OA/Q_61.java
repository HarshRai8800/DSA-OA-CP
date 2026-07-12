import java.util.*;

public class Q_61{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maximumSumSubarray(arr, k));
    }
    public static long maximumSumSubarray(int[]arr,int k){
        HashMap<Integer,Long> prefixMap = new HashMap<>();
        
        int n = arr.length;
        long totalSum = 0;
        long maxSum = 0;

        for(int i=0;i<n;i++){
            int val1  = arr[i]+k;
            int val2 = arr[i]-k;
            if(prefixMap.containsKey(val1)){
                long prevSum = prefixMap.get(val1);
                maxSum = Math.max(maxSum,totalSum-prevSum+arr[i]);
            }
            if(prefixMap.containsKey(val2)){
                long prevSum = prefixMap.get(val2);
                maxSum = Math.max(maxSum,totalSum-prevSum+arr[i]);
            }
            prefixMap.put(arr[i],Math.min(prefixMap.getOrDefault(arr[i],totalSum),totalSum));
            totalSum += arr[i];
        }
        return maxSum;
    }
}