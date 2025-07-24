class Solution {

    public boolean isPalindrome(int x) {

        if (x< 0){
            return false;
        }
        int n =x;
        int rev = 0;
        while(x >0){
            int rem = x%10;
            rev = rev*10 + rem;
            x /= 10; 
        }
       return n == rev;
    }
};