import java.util.*;
class Main {
    //rotate left by 1 place
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n =arr.length;
        int[] temp = new int[n];
        int index = 0;
        for(int i=1;i<n;i++){
            temp[index++] = arr[i];
        }
        temp[n-1] = arr[0];
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}