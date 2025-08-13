class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            char[] arr = words[i].toCharArray();
            boolean found = false;


            for(int j=0;j<arr.length;j++){
                if(x == arr[j]){
                    found = true;
                    break;
                }
            }

            if(found){
                list.add(i);
            }
        }
        return list;
    }
}