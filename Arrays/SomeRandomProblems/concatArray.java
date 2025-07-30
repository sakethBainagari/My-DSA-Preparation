class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = 2*n;
        int j=0;
        int[]  temp = new int[m];
        for(int i=0;i<n;i++){
            temp[j++] = nums[i];
        }
        for(int i=0;i<n;i++){
            temp[j++] = nums[i];
        }

        return temp;
    }
}