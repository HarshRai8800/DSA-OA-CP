import java.util.*;

public class Q_34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        int count  = 0;

        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(Math.abs(arr[i]+arr[j])+Math.abs(arr[i]-arr[j]) ==t){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}