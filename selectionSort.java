import java.util.*;
class sorting {
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
    public static void selection(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int mini = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]< arr[mini]){
                    mini = j;
                }
            }
            swap(arr,i,mini );
            // print(arr,n);// use this if you want array for every iteration
            
        }
        print(arr,n);
    }
    public static void main(String[] args) {
        int[] arr ={9,1,6,4,3,2} ;
        int n = arr.length;
        selection(arr,n);
       
        
    }
}