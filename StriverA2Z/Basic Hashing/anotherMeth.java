import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
       
    //-----to iterate over map-------
        
        map.forEach((k,v)->System.out.println(k + " -> "+v));
        
    
        
        int q = s.nextInt();
        while(q-->0){
            int num = s.nextInt();
            if(map.containsKey(num)){
                System.out.println(map.get(num));
            }else{
                System.out.println(0);
            }
        }
    }
}