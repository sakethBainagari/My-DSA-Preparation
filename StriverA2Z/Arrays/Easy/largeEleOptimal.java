import java.util.*;
class largeEleOptimal {
    public static int largeEle(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,55,2,2,12,99,3,1,39};
        int n= arr.length;
        int max = largeEle(arr,n);
        System.out.println(max);
    }
}