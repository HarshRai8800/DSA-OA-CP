import java.util.*;

public class Q_22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String t  = sc.next();
        
        HashMap<Character,Integer>mapS = new HashMap<>();

        for(int i=0;i<s.length();i++){
            mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
        }

        HashMap<Character,Integer>mapT = new HashMap<>();

        for(int i=0;i<t.length();i++){
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
        }

        int count = s.length()/t.length();

        for(Map.Entry<Character,Integer>entry:mapT.entrySet()){

            char ch = entry.getKey();
            count = Math.min(count,mapS.get(ch)/entry.getValue());

        }

        System.out.println(count);
    }
}