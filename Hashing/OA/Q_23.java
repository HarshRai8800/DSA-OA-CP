import java.util.*;
public class Q_23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }    

        int count = 0;
        int flag = 0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int val = entry.getValue();
            if(val<=1){
                flag = 1;
                break;
            }
            if(val%3==0){
                count+= val/3;
            }else{
                count+=(val/3)+1;
            }
        }

        if(flag==1){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }
    }
}