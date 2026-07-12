import java.util.*;

public class Q_41{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];

        int total = 0;
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            total+=nums[i];
        }

        //Find the number of ways to divide the given array in two equal parts. 

    //     int no = 0;
    //     int lhs = nums[0];
    //     if(total%2==0){
    //     for(int i=1;i<n;i++){
    //         int rhs = total-lhs;

    //         if( lhs== total/2){
    //             no++;
    //         }

    //         lhs += nums[i];
    //     }

    // }

       // Follow up - Find the number of partitions to divide the array in 3 equal parts. 
    //    int no = 0;
    //    if(total%3==0){

    //       int y = total/3;
    //       HashMap<Integer,Integer>map = new HashMap<>();
    //       int lhs = 0;

    //       for(int i=0;i<n-1;i++){
    //         lhs += nums[i];
    //         if(lhs==2*y){
    //             no += map.getOrDefault(y,0);
    //         }
    //         map.put(lhs,map.getOrDefault(lhs,0)+1);
    //       }
    //    }

    //Follow up - Find the number of ways to divide the given array in four equal parts. 
    int no = 0;
    if(total%4==0){
    int y = total/4;
    int rhs = nums[n-1];
    int right[] = new int[n];

    HashMap<Integer,Integer>map2 = new HashMap<>();
    map2.put(rhs,1);
    for(int i=n-2;i>=0;i--){
        rhs+=nums[i];
        if(rhs==2*y){
            right[i] = map2.getOrDefault(y,0);
        }
        map2.put(rhs,map2.getOrDefault(rhs,0)+1);
    }

    int lhs = nums[0];
    
    HashMap<Integer,Integer>map1 = new HashMap<>();
    map1.put(lhs,1);
    for(int i=1;i<n-2;i++){
        lhs+=nums[i];
        if(lhs==2*y){
            no +=  right[i+1]*map1.getOrDefault(y,0);
        }
        map1.put(lhs,map1.getOrDefault(lhs,0)+1);
    }
    }   
    System.out.println(no);
}
}
