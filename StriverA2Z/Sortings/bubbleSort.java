import java.util.*;
class bubbleSort {
    public static void print(int[] arr,int n){
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void bubble(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
        //didSwap used to avoid iterations if array is sorted;
		        int didSwap = 0;
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,(j+1) );
	                    didSwap=1;
                }
            }
            if(didSwap == 0) {
	            break;
            }
            // print(arr,n);// use this if you want array for every iteration
        }
        print(arr,n);
    }
    public static void main(String[] args) {
        int[] arr ={9,1,6,4,3,2} ;
        int n = arr.length;
        bubble(arr,n);
       
        
    }
}