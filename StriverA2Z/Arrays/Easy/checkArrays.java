class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean Sorted = true;
            for(int j=0;j<n-1;j++){
                int curr = nums[(i+j)%n];
                int next = nums[(i+j+1)%n];
                if(curr > next){
                    Sorted = false;
                    break;
                }
            }
            if(Sorted){
                return true;
            }  
        }
        return false;
    }
}
