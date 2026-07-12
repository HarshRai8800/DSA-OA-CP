import java.util.*;
public class Q_24{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[q];

        int maxElm = 0;
        for(int i=0;i<q;i++){
            arr[i] = sc.nextInt();
            maxElm = Math.max(maxElm,arr[i]);
        }


        int prefix[] = new int[maxElm+k+2];

        for(int i = 0;i<q;i++){
            int l = arr[i]-k;
            int r = arr[i]+k;

            prefix[l] = prefix[l]+1;
            prefix[r+1] = prefix[r+1]-1;
        }


        int ans = 0;

        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i]+prefix[i-1];
            ans = Math.max(ans,prefix[i]);
        }

        System.out.println(ans);

    }



}