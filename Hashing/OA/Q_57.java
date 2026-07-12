import java.util.*;

public class Q_57{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int productsPrice[] = new int[n];
        for(int i=0;i<n;i++){
            productsPrice[i] = sc.nextInt();
        }

        int pairs = 0;

        // int map[] = new int[x];

        // for(int i=0;i<n;i++){
        //     int oval = productsPrice[i];
        //     int mod = oval%x;
        //     int req = x-mod;

        //     pairs += map[req];

        //     map[mod]++;
        // }

        HashMap<Integer,Integer>map = new HashMap<>();

         for(int i=0;i<n;i++){
            int oval = productsPrice[i];
            int mod = oval%x;
            int req = x-mod;

            pairs += map.getOrDefault(req,0);

            map.put(mod,map.getOrDefault(mod,0)+1);
        }

        System.out.println(pairs);
        
    }
}