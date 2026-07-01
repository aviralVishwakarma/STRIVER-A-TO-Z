class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { //Duplicate value of i
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> triplet = new ArrayList(Arrays.asList(nums[i], nums[j], nums[k]));
                    list.add(triplet);
                    int temp_j = nums[j];
                    int temp_k = nums[k];
                    while (j < nums.length && nums[j] == temp_j) {
                        j++;
                    }
                    while (k > 0 && nums[k] == temp_k) {
                        k--;
                    }
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    int temp_j = nums[j];
                    while (j < nums.length && nums[j] == temp_j) {
                        j++;
                    }
                } else {
                    int temp_k = nums[k];
                    while ( k >0  && nums[k] == temp_k) {
                        k--;
                    }
                }
            }
        }
        return list;

    }
}