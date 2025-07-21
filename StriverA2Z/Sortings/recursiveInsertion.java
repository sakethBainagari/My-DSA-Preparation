import java.util.*;
//using recursion
class recursiveInsertion {
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
    public static void insertion(int[] arr,int i, int n){
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j] < arr[j-1]){
            swap(arr,j,(j-1));
            j--;
        }
        insertion(arr,i+1,n);
    }
    public static void main(String[] args) {
        int[] arr ={9,1,6,4,3,2} ;
        int n = arr.length;
        insertion(arr,0,n);
        print(arr,n);
       
        
    }
}