import java.util.*;

public class Q_28{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {0,1,1,1,2,2,2,3,3,3};

        int x = 1;
        int y = 2;
        int z = 3;

        int cx[] = new int[10];
        int cy[] = new int[10];
        int cz[] = new int[10];

        for(int i=1;i<=9;i++){
            if(arr[i]==x){
                cx[i]  = cx[i-1]+1;
                cy[i] = cy[i-1];
                cz[i] = cz[i-1];
            }
            if(arr[i]==y){
                cy[i] = cy[i-1]+1;
                cx[i] = cx[i-1];
                cz[i] = cz[i-1];
            }
            if(arr[i]==z){
                cz[i] = cz[i-1]+1;
                cx[i] = cx[i-1];
                cy[i] = cy[i-1];
            }
        }

        HashMap<String,Integer>map = new HashMap<>();
        map.put("<0,0>",1);
        int count = 0;
        for(int i=1;i<10;i++){
            int one = cx[i]-cy[i];
            int two = cz[i]-cx[i];

            String s = "<"+one+","+two+">";
            if(map.containsKey(s)){
                count +=map.get(s);
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }

        System.out.println(count);
    }
}