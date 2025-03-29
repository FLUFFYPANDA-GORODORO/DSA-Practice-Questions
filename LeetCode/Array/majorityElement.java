class Solution {
    public int majorityElement(int[] nums) {
        
        for(int i = 0; i < nums.length ; i++){
            int count = 0;
            for(int j = i ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
                return nums[i];
            } 
        }
        return -1;
    }
}

//---------------------------------------------------------

class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

//-----------------------------------------------------

// 2 more method to solve this question 

// HashMap
// Bit manipulatuon 
// Solve Later
