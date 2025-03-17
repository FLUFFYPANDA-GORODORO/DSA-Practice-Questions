// Solution using array method
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i , j};
                }
            }
        }
        throw new IllegalArgumentException("Invalid Syntax"); 
        //return null;  
    }
}

//Time  Complexity : O(n^2)
//Space Complexity : O(n)

// ----------------------------------------------------------------
// Solution using Hashmap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexMap =  new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            indexMap.put(nums[i],i);
        }  
        for(int i = 0; i < nums.length; i++){
            int n = target - nums[i];
            int index_of_n = indexMap.getOrDefault(n,-1);
            if(index_of_n != -1 && index_of_n != i){
                return new int[]{i,index_of_n};
            }
        }
        return null;

    }
}

//Time  Complexity : O(n)
//Space Complexity : O(n)

