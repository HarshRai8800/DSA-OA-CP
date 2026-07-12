import java.util.*;

public class SetB6{
    public static void main(String args[]){
    
    int arr[] = {2,5,4,6};

    int n = arr.length;

    numSubArrays(arr,n);
    
    }

    public static void numSubArrays(int arr[],int n){
            int left = 0;
            int right = 0;
            int sum = 0;
            int num = 0;


            while(left<n){

                while(right<n&&sum+arr[right]==(sum^arr[right])){

                    sum+= arr[right];
                    right++;
                }

                num += right-left;
                if(left==right){
                    right++;
                }else{
                    sum -=arr[left];
                }
                left++;
            }
            System.out.println(num);
    }
}