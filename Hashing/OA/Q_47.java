import java.util.*;

public class Q_47{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        // approach 1

        // int tsum = 0;

        // for(int i=0;i<n;i++){
        //     tsum += nums[i];
        // }

        // int result = 0;

        // for(int i=0;i<n;i++){

        //     int Y = digitCount(nums[i]);
        //     result += (nums[i]*n) + Math.pow(10,Y)*tsum;

        // }


        //approach 2

        int digit[] = new int[7];
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            int dig = digitCount(nums[i]);
            digit[dig]++;
        }


        int result = 0;

         for(int i=0;i<n;i++){
            int powerSum  = sum;
            int l = 1;
            while(l<=6){
                powerSum += nums[i]*(int)Math.pow(10,l)*digit[l];
                l++;
            }
            result += powerSum;
        }

        System.out.println(result);

    }

    public static int digitCount(int num){

        return Integer.toString(num).length();

    }
}