import java.util.*;

public class Q_27{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int p = sc.nextInt();

        int lamps[][] = new int[l][2];
        int max = 0;
        for(int i=0;i<l;i++){
            lamps[i][0] = sc.nextInt();
            lamps[i][1] = sc.nextInt();
            max = Math.max(max, lamps[i][1]);
        }

        int points[] = new int[p];
        for(int i=0;i<p;i++){
            points[i] = sc.nextInt();
            max = Math.max(max,points[i]);
        }

        int prefix[] = new int[max+2];

        for(int i=0;i<l;i++){
            int ll = lamps[i][0];
            int up = lamps[i][1]+1;
            prefix[ll] = prefix[ll]+1;
            prefix[up] = prefix[up]-1;
        }

        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i]+prefix[i-1];
        }

        for(int i=0;i<p;i++){
            System.out.print(prefix[points[i]]+" ");
        }
    }
}