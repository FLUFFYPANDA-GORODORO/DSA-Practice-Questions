// Stack approach -> O(n)

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer , Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack();

        for(int i = 0 ; i < nums2.length ; i++){
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop() , nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for(int i : stack){
            map.put(i , -1);
        }

        for(int i = 0 ; i < nums1.length ; i++){
             result[i] = map.get(nums1[i]);
        }
        return result;
    }
}


//Brute Force approach -> O(n^2)

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        boolean found = false;
        for(int i = 0 ; i < nums1.length ; i++){
            found = false;
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    found = true;
                }
                if(found && nums2[j] > nums1[i]){
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        for(int i = 0 ; i < result.length ; i++){
            if(result[i] == 0){
                result[i] = -1;
            }
        }
        return result;
    }
}

