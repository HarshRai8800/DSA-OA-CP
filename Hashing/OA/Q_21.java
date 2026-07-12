import java.util.*;
public class Q_21{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        int arr[] = new int[leng];

        for(int i=0;i<leng;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map = new HashMap<>();
        int max = -1;
        int maxCount = 0;

        for(int i=0;i<leng;i++){
            int soln = digitSum(arr[i]);
            if(map.containsKey(soln)){
                int curr = map.get(soln);
                if(max<curr+arr[i]){
                    maxCount = 1;
                    max = curr+arr[i];
                }else if(max==curr+arr[i]){
                    maxCount++;
                }
                map.put(soln,Math.max(curr,arr[i]));
            }else{
                map.put(soln,arr[i]);
            }
        }

        System.out.println(max);
        System.out.println(maxCount);

    }
    public static int digitSum(int num){
        int sum = 0;
        while(num!=0){
            sum+=num%10;
            num = num/10;
        }
        return sum;
    }
}