class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer > map = new HashMap<>();

        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0) +1);
        }

        List<Integer> result =  new ArrayList<>();

        for(int num : nums2){
            int found = map.getOrDefault(num,0);
            if(found>0){
                result.add(num);
                map.put(num,found - 1);
            }
        }

        int[] intersection = new int[result.size()];
        for(int i = 0 ; i < result.size() ; i++){
            intersection[i] = result.get(i);
        }
        return intersection;
    }
}
