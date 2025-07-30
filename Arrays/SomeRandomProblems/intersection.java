class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        Set<Integer> res = new HashSet<>();
        for(int i:nums2){
            if(set1.contains(i)){
                res.add(i); 
            }
        }
        int n = res.size();
        int[] arr = new int[n];
        int i=0;
        // List<Integer> list = new ArrayList<>(res);
        // for(int i=0;i<n;i++){
        //     arr[i] = list.get(i);
        // }
        for (int val : res) {
            arr[i++] = val;  
        }       
        return arr;
    