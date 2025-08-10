class Solution {
    public int removeDuplicates(int[] nums) {
        //Used linked hashset to maintain insertion order
        Set<Integer> set = new LinkedHashSet<>();
        int n = nums.length;
        //O(n logn)
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        } 
        int index = 0;
        int k = 0;
        //O(n)
        for(int i: set){
            nums[index++] = i;
            k++;
        }
        //total TC:(n logn + n)
        return k;
    }
}