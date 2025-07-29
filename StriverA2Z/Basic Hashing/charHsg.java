import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String str = s.next();
       int n = str.length();
       //precomputing
       // we took size 26 because they mentioned only lowercase 
       int[] hash = new int[26];
       for(int i=0;i<n;i++){
           hash[str.charAt(i)-'a'] +=1;
       }
       
       int e = s.nextInt();
       while(e-->0){
           char key = s.next().charAt(0);
           //fetch
           System.out.println(hash[key-'a']);
       }
    }
}