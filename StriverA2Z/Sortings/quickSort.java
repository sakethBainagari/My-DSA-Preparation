import java.util.*;
class quickSort {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partition(int[] arr, int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i] <= pivot && i<=high-1){
                i++;
            }
            while(arr[j] >= pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    public static void quickSort(int[] arr,int low, int high){
        if(low < high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr, low,pivotIndex-1);
            quickSort(arr, pivotIndex+1,high);
    }
    public static void main(String[] args) {
        int[] arr= {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;
        System.out.println("Array before sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        quickSort(arr,0,n-1);
        
        System.out.println("Array After sort:");
         for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}