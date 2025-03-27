class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg = 0 , end = nums.length - 1;

        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            //Sometimes the test cases are big and the there are chances of overflow due to addition of beg + end . So we write it like this to 
            //avoid overflow condition
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                beg = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end + 1;
    }
}
