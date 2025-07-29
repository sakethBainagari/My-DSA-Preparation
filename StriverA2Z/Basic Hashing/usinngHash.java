
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = str.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char key = str.charAt(i);
            int freq = 0;
            if(map.containsKey(key)){
                freq = map.get(key);    
            } 
            freq++;
            map.put(key,freq);
        }
        for(Map.Entry<Character, Integer> in : map.entrySet()){
            System.out.println(in.getKey() + "->" + in.getValue());
        }
        
        
        int q = s.nextInt();
        while(q-->0){
            char ch = s.next().charAt(0); 
            if(map.containsKey(ch)){
                System.out.println(map.get(ch));
            }else{
                System.out.println(0);
            }
        }
    }
}