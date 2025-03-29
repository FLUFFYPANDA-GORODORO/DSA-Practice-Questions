class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : nums1){
            set.add(num);
        }
                
        for(int num : nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        int[] resultArr = new int[result.size()];
        int i = 0;
        for(Integer num : result){
            resultArr[i++] = num; 
        }

        return resultArr;

    }
}

//----------------------------------------------------------------------------------------
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();

        Integer[] newNums1 = Arrays.stream(nums1).boxed().toArray(Integer[] :: new);
        Integer[] newNums2 = Arrays.stream(nums2).boxed().toArray(Integer[] :: new);


        intersection.addAll(Arrays.asList(newNums1));
        intersection.retainAll(Arrays.asList(newNums2));

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }
        return result;
    }
}
