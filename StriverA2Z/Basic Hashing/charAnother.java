import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String str = s.next();
       int n = str.length();
       //precomputing
       // we took size 256 because they mentioned any particular case 
       int[] hash = new int[256];
       for(int i=0;i<n;i++){
           hash[str.charAt(i)] +=1;
       }
       
       int e = s.nextInt();
       while(e-->0){
           char key = s.next().charAt(0);
           //fetch
           System.out.println(hash[key]);
       }
    }
}