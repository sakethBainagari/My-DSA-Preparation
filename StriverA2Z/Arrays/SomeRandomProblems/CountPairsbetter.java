class Solution {
    public int countPairs(List<Integer> nums, int target) {

        // if this break early takes nlogn TC
        int n = nums.size();
        int count = 0;
        Collections.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;

        
    }
}