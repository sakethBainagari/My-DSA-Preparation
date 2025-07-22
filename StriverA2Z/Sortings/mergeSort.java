import java.util.*;
class mergeSort {
    public static void merge(int[] arr,int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int i=0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[i] = arr[left];
                i++;
                left++;
            }else{
                temp[i]=arr[right]; // or directly we can right temp[i++] = arr[right++]
                i++;
                right++;
            }
        }
        while(left <= mid){
            temp[i++] = arr[left++];
            
        }
        while(right <= high){
            temp[i++] = arr[right++];
        }
         for(int j=low;j<=high;j++){
            arr[j] = temp[j-low];
        }
        //If above loop wont work use below loop
        // for(int j=0;j<temp.length;j++){
        //    arr[low+j] = temp[j];
        //}
        
        //===========================================
        // Print the array after each merge
        // System.out.print("After merging [" + low + ", " + high + "]: ");
        // for (int val : arr) {
        //     System.out.print(val + " ");
        // }
        // System.out.println();
        
        
    }
    public static void divide(int[] arr, int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
        
    }
    public static void main(String[] args) {
        int[] arr= {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;
        System.out.println("Array before sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        divide(arr,0,n-1);
        System.out.println("Array After sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}