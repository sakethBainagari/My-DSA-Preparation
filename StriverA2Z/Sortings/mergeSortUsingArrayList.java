import java.util.*;
class mergeSortUsingArrayList {
    public static void merge(int[] arr,int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);// or directly we can right temp.add(arr[right++])
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left++]);
            
        }
        while(right <= high){
            temp.add(arr[right++]);
        }
        
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        //If above loop wont work use below loop
        // for(int j=0;j<temp.length;j++){
        //    arr[low+j] = temp.get(j);
        //}
        
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