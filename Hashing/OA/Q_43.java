import java.util.*;

public class Q_43{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int nums[] = new int[N];

        for(int i=0;i<N;i++){
            nums[i] = sc.nextInt();
        }

        long prefix[] = new long[N];

        for(int i=0;i<N;i++){
            if(i-Y>=0){
                prefix[i] = prefix[i-Y]+nums[i];
            }else{
                prefix[i] = (int)nums[i];
            }
        }

        long min = (long)1e18;
        // 2 4 6 7 9 3 5 10  X = 2, Y = 2

        for(int i=0;i<N;i++){
            int index = i- (X-1)*(Y);
            if(index>=0){
                long g = prefix[i];
                if(index-Y>=0){
                    g = g-prefix[index-Y];
                }
                min = Math.min(min,g);
            }
        }


        System.out.println(min);
    }
}