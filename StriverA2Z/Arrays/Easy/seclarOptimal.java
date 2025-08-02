import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,34,23,31,43,1};
        int n = arr.length;
        if(n==0 || n==1) System.out.println(-1)
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && arr[i] < max){
                secMax = arr[i];
            }
        }
        System.out.print("Second Largest element: "+ secMax);
        
    }
}