//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int sec_max = Integer.MIN_VALUE;
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < max && arr[i] > sec_max){
                sec_max = arr[i];
                found = true;
            }
        }
        return found ? sec_max : -1;
    }
}