import java.util.*;

public class Fundamentals_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map = new HashMap<>();
        int flag = 0;

        for(int i=0;i<n;i++){
            int val = arr[i];
            if(map.containsKey(val)&&i-map.get(val)<=3){
             System.out.println("Element found at index "+ map.get(val));
             flag = 1;
             break;
            }
            map.put(val,i);
        }

        if(flag==0)System.out.println("No element found in "+ k+" distance");
    }
}