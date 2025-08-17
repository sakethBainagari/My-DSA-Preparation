class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int[] count = new int[101];
        for(int num:nums){
            count[num]++;
        }
        for(int i=1;i<101;i++){
            count[i] += count[i-1];
        }
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                temp[i] = 0;
            }else{
                temp[i] = count[nums[i]-1];
            }
        }
        return temp;
    }
}