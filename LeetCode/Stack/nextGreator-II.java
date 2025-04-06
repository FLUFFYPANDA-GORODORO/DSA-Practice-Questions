class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        Stack<Integer> stack = new Stack<>();

        for(int i = n - 2 ; i >= 0 ; i--){
            while(stack.size() > 0 && stack.peek() <= nums[i]){
                stack.pop();
            } 
            stack.push(nums[i]);
        } 
        int ans[] = new int[n];

        for(int i = n - 1 ; i >= 0 ; i--){
            while(stack.size() > 0 && stack.peek() <= nums[i]){
                stack.pop();
            }
            ans[i] = stack.size() == 0 ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return ans;
    }
}
