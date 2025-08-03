import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,34,23,31,43,1};
        int n = arr.length;
        if(n==0 || n==1) System.out.println(-1);
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] < min){
                secMin = min;
                min = arr[i];
            }else if(arr[i] < secMin && arr[i] >  min){
                secMin = arr[i];
            }
        }
        System.out.print("Second Smallest element: "+ secMin);
        
    }
}