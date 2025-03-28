//Brute force array approach -> O(n^2) Time Complexity

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}


// -----------------------------------------------------------------
//Sorting approach

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //O(nlogn)
        Arrays.sort(nums);

        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

//-------------------------------------------------------------------
//Set approach -> Best approach

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            if(numSet.add(num) == false){
                return true;
            }
        }
        return false;
    }
}



