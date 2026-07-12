import java.util.*;

public class Q_44{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        long quadtriplets = 0;

        // for(int i=0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         HashMap<Integer,Integer>map = new HashMap<>();

        //         for(int l=j+2;l<n;l++){
        //             map.put(nums[l],map.getOrDefault(nums[l],0)+1);
        //         }

        //         for(int k=j+1;k<n-1;k++){
        //             int val = -1*(nums[i]+nums[j]+nums[k]);

        //             quadtriplets += map.getOrDefault(val,0);

        //             int freq = map.get(nums[k+1]);
        //             if(freq==1)map.remove(nums[k+1]);
        //             else map.put(nums[k+1],freq-1);
        //         }

        //         }
        //     }

            
        // System.out.println("FINAL = " + quadtriplets);


        for(int i=0;i<n;i++){

            HashMap<Integer,Integer>map = new HashMap<>();
            for(int k=i+2;k<n;k++){
                for(int l = k+1;l<n;l++){
                    map.put(nums[k]+nums[l],map.getOrDefault(nums[k]+nums[l],0)+1);
                }
            }

            for(int j=i+1;j<n;j++){

                int sum = -(nums[i]+nums[j]);

                quadtriplets += map.getOrDefault(sum,0);

               for(int k=j+2;k<n;k++){
                    int s = nums[j+1] + nums[k];

                    int freq = map.get(s);

                    if(freq == 1)
                        map.remove(s);
                    else
                    map.put(s, freq - 1);
                    }

                }
            }

        System.out.println(quadtriplets);
        }
    }
