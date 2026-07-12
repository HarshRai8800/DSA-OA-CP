
// Q: Given a sorted array of size “N”; find the index of the number in the array which is just greater than x and as close as possible to x.
// 
// -> Upper Bound (x) = Returns index of the number which is just greater than x and as close as possible to x

import java.util.*;

class Q2{
    public static void main(String args[]){
        int arr[] = {1, 3, 5, 6 , 6, 7, 7, 9};

        int x = 10;

        int ans = upperBound(arr,x);

        if(ans == arr.length){
            System.out.println("No element is greater than " + x);
        }else{
            System.out.println("The index of the number which is just greater than " + x + " is: " + ans);
        }
    }

    public static int upperBound(int arr[],int x){

        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]<=x){
                left = mid+1;
            }else{
                if(mid==0){
                    return mid;
                }
                if(arr[mid-1]>x){
                    right=mid-1;
                }else{
                    return mid;
                }
            }
        }
        return arr.length;
    }
}