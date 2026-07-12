import java.util.*;

public class Q_55{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String str  = sc.next();

        for(int i=0;i<q;i++){
            int counter = 0;
            int ch[] = new int[26];
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j=l;j<=r;j++){
                char c = str.charAt(j-1);
                int ind = c-'a';
                ch[ind]++;
                counter += ch[ind];
            }
            System.out.println(counter);
        }

    }
}