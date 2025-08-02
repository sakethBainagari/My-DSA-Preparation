//if array contains duplicate elements this approch fails
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,34,23,31,43,1};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Second Largest element: " + arr[n-2]);
    }
}