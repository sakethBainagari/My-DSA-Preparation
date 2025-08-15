class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] %2 == 0){
                temp[i] = 0;
            }else{
                temp[i] = 1;
            }
        }
        Arrays.sort(temp);
        return temp;
    }
}