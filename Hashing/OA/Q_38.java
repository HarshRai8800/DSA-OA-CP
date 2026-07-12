import java.util.*;

public class Q_38{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long nums1[] = new long[n];
        long nums2[] = new long[n];
        long nums3[] = new long[n];
        long nums4[] = new long[n];
        long nums5[] = new long[n];

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
        for(int i=0;i<n;i++){
            nums5[i] = sc.nextInt();
        }

        HashMap<Long,Integer> map = new HashMap<>();


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map.put(nums1[i]+nums2[j],map.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }

        int tuples = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    long sum = nums3[i]+nums4[j]+nums5[k];
                    if(map.containsKey(-1*sum)){
                        tuples+= map.get(-1*sum);
                    }
                }
            }
        }

        System.out.println(tuples);
}
}