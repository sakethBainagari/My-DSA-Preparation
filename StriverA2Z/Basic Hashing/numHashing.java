import java.util.*;
class numHashing{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = s.nextInt();
       }
       //precomputing
       int[] hash = new int[12];
       for(int i=0;i<n;i++){
           hash[arr[i]] +=1;
       }
       
       int e = s.nextInt();
       while(e-->0){
           int key = s.nextInt();
           System.out.println(hash[key]);
       }
    }
}