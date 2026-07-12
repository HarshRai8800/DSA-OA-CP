import java.util.*;

public class Q_46{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        long sum = 0;

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         sum =  (sum + concat(arr[i],arr[j]))%998244353;
        //     }
        // }

        long pref = 0;

        for(int i=0;i<n;i++){
            int leng = i;
            int y = getY(nums[i]);

            sum += (nums[i]*leng) + (Math.pow(10,y)*pref);
            
            pref += nums[i];
        }

        System.out.println(sum);

    }

    public static int getY(int num){

        int y = 0;

        while(num!=0){
            y++;
            num = num/10;
        }

        return y;
    }

    // public static long concat(int num1,int num2){
    //     String str = ""+num1+nums2;


    //     return Long.parseLong(str);
    // }
}