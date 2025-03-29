class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
        
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int beg = i + 1;  
            int end = nums.length - 1; 

            while (beg < end) {
                int sum = nums[i] + nums[beg] + nums[end];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[beg], nums[end]));

        
                    while (beg < end && nums[beg] == nums[beg + 1]) {
                        beg++;
                    }

                    while (beg < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    beg++;
                    end--;
                } else if (sum < 0) {
                    beg++;
                } else {
                    end--; 
                }
            }
        }

        return result;
    }
}
