import java.util.*;

public class Q_40{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        // int suff[] = new int[n];
        // suff[0] = nums[0];

        // for(int i=1;i<n;i++){
        //     suff[i] =Math.min(suff[i-1],nums[i]);
        // }

        // int pref = 0;
        // int flag = 0;
        // for(int i=n-1;i>=1;i--){
        //     if(nums[i]>suff[i-1]&&nums[i]<pref){
        //         System.out.println(suff[i]+","+nums[i]+","+pref);
        //         flag = 1;
        //         break;
        //     }
        //     pref = Math.max(pref,nums[i]);
        // }

        // System.out.println(flag);

        // Now for follow up quewtion where we have to find the triplet where the three element should be +1 of each other means
        // a[i-1]+1 = a[i], a[i]+1=a[i+1];
        
        HashMap<Integer,Integer>map1 = new HashMap<>();

        int suff[] = new int[n];
        Arrays.fill(suff,-1);
        map1.put(nums[0],1);
        for(int i=1;i<n;i++){
            if(map1.containsKey(nums[i]-1)){
                suff[i] = nums[i]-1;
            }
            map1.put(nums[i],1);
        }

        HashMap<Integer,Integer>map2 = new HashMap<>();
        map2.put(nums[n-1],1);

        for(int i=n-2;i>=1;i--){
            if(map2.containsKey(nums[i]+1)){
                if(suff[i]!=-1){
                    System.out.println(suff[i]+","+nums[i]+","+(nums[i]+1));
                }
            }
            map2.put(nums[i],1);
        }
    }
}