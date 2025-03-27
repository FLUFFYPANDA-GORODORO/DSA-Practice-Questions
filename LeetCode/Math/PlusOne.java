class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1 ; carry > 0 && i >= 0 ; i--){
            int temp = carry;
            carry = (digits[i] + carry) / 10;
            digits[i] = (digits[i] + temp) % 10;
        }
        if(carry != 1){
            return digits;
        }
        else{
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for(int i = 0 ; i < digits.length ; i++){
                res[i+1] =  digits[i];
            }
            return res;

        }
    }
}
