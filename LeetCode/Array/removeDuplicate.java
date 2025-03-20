class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0) return 0;
        int prev = 0;

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[prev] != nums[i]){
                prev++;
                nums[prev] = nums[i];
            }
        }

        return prev+1;
    }
}

//Time  complexity : O(n)
//Space complexity : constant
