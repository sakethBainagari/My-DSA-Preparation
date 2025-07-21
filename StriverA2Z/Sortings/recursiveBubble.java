import java.util.*;
class recursiveBubble {
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
        if(n==1) return;
        int didswap = 0;
        for(int j=0;j<=n-2;j++){
            if(arr[j] > arr[j+1]){
                swap(arr,j,(j+1) );
                didswap =1;

            }
        }
        if(didswap == 0) return;
        bubble(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr ={9,1,6,4,3,2} ;
        int n = arr.length;
        bubble(arr,n);
        print(arr,n);
       
        
    }
}