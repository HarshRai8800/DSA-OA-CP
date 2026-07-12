import java.util.*;

public class Fundamentals_6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int prefix[] = new int[n+1];
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
            prefix[i] = prefix[i-1]+arr[i];
        }

        int l = sc.nextInt();
        int r = sc.nextInt();//l<=r

        System.out.println(prefix[r]-prefix[l-1]);
       
    }
}