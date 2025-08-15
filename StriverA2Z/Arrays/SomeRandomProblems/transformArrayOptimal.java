class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int start = 0;
        int end = n-1;
        for(int i=0;i<n;i++){
            if(nums[i] %2 == 0){
                temp[start++] = 0;
            }else{
                temp[end--] = 1;
            }
        }
        return temp;
    }
}