//Nomral method
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != i)
                return i;
            else
                continue;
        }
        return nums.length;
    }
}

//Using XOR method

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorResult = 0;

        for (int i = 0; i <= n; i++) {
            xorResult ^= i;
        }

        for (int num : nums) {
            xorResult ^= num;
        }
        return xorResult;
    }
}
