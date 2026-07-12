import java.util.*;

public class Q_29{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String []timings = new String[n];

        for(int i=0;i<n;i++){
            String s[] = sc.nextLine().split(" ");
            timings[i] = s[2]+" "+s[3];
        }

        int prefix[] = new int[1441];

        for(int i=0;i<n;i++){
            String time[] = timings[i].split(" ");

            String[] s = time[0].split(":");
            String[] e = time[1].split(":");
            
            int start = (Integer.parseInt(s[0])*60)+Integer.parseInt(s[1]);
            int end = (Integer.parseInt(e[0])*60)+Integer.parseInt(e[1]);

            prefix[start] = prefix[start]+1;
            prefix[end+1] = prefix[end+1]-1;
        }

        int freeLength = 0;

        for (int i = 0; i < 1441; i++) {
            if (i > 0) prefix[i] += prefix[i - 1];

            if (prefix[i] == 0) {
                freeLength++;
                if (freeLength >= k) {
                    int startTime = i - k + 1;
                    System.out.println(String.format("%02d:%02d", startTime / 60, startTime % 60));
                    break;
                }
            } else {
                freeLength = 0;
            }
        }

    }
}