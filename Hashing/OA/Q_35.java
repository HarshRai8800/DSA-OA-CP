import java.util.*;

public class Q_35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s1[] = new String[n];
        String s2[] = new String[n];

        for (int i = 0; i < n; i++) {
            s1[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            s2[i] = sc.next();
        }

        String ans[] = new String[n];

        for(int i=0;i<n;i++){
            if(check(s1[i],s2[i])){
                ans[i] = "Yes";
            }else{
                ans[i] = "No";
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }

    }

    public static boolean check(String s1,String s2){
        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();
        HashMap<Character,Integer>map3 = new HashMap<>();
        HashMap<Character,Integer>map4 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(i%2==0){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            }else{
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
        }

        for(int i=0;i<s2.length();i++){
            char ch = s1.charAt(i);
            if(i%2==0){
            map3.put(ch,map3.getOrDefault(ch,0)+1);
            }else{
            map4.put(ch,map4.getOrDefault(ch,0)+1);
            }
        }

        for(char ch='a';ch<='z';ch++){
                if(map1.getOrDefault(ch,0)!=map3.getOrDefault(ch,0)){
                    return false;
                }
                if(map2.getOrDefault(ch,0)!=map4.getOrDefault(ch,0)){
                    return false;
                }
        }

        return true;

    }
}