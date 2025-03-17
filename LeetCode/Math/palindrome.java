class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
         
        int rev = 0;
        int temp = x;

        while(temp>0){
            int rem = temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;
        }


        return x == rev;

    }
}

//Time  Complexity : O(n) where , n is the order of digits
//Space Complexity : O(1)
