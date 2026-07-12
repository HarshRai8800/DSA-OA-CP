import java.util.*;

public class Fundamentals_1{
    public static void main(String args[]){
        int arr[] ={0,0,1,1,2,2,3,3,3,5,5,5,5,1,7};

        HashMap<Integer,Integer>map = new HashMap<>();
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int minElm = -1;
        int max = 0;
        int maxElm = -1;

        for(int i=0;i<n;i++){
            int val = arr[i];
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            
            int val = entry.getKey();
            int freq = entry.getValue();
            if(min>freq){
                min = freq;
                minElm = val;
            }
            if(max<freq){
                max = freq;
                maxElm = val;
            }
        }

        System.out.println("Min element is : "+minElm+" with frequency : "+min);
        System.out.println("Min element is : "+maxElm+" with frequency : "+max);
    }
}