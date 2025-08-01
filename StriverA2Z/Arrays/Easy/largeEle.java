import java.util.*;
class largeEle {
    public static void main(String[] args) {
        int[] arr = {3,4,55,2,2,12,99,3,1,39};
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("Largest element in array: "+ arr[n-1]);
    }
}