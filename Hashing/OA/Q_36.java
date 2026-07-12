import java.util.*;

public class Q_36{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums1[]= new int[n];
        int nums2[] = new int[n];
        int nums3[] = new int[n];
        int nums4[] = new int[n];

        for(int i=0;i<n;i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums3[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums4[i] = sc.nextInt();
        }

         HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val =-1*(nums1[i]+nums2[j]);
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }

        int tuples = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               int val = nums3[i]+nums4[j];
               if(map.containsKey(val)){
                tuples+=map.get(val);
               }
            }
        }

        System.out.println(tuples);
    }
}