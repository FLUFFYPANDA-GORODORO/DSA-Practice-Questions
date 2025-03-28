//Brute Force array approach -> O(n^2) -> Time Complexity
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    System.out.print(i + " " + j);
                    if(Math.abs(i - j) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

//Set Approach

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for(int i = 0 ; i < nums.length;i++){
            if(i > k){
                window.remove(nums[i-k-1]);
            }
            if(window.add(nums[i]) == false){
                return true;
            }
        }
        return false;
    }
}
