class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+2 ; j < n ; j++){
                set.add(nums[j-1]);
                int t =  -(nums[i]+nums[j]);
                if(set.contains(t)){
                    List<Integer> temp = Arrays.asList(nums[i] , nums[j] , t);
                    Collections.sort(temp);
                    list.add(temp);
                }
            }
        }
        List<List<Integer>> triplet = new ArrayList<>(list);
        return triplet;
    }
}