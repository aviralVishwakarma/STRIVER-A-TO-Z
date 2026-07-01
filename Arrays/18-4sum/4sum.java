class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> quad = new HashSet<>();
                for (int k = j + 2; k < n; k++) {
                    long t = (long) target -nums[i] - nums[j] - nums[k]; // Since the array we got is of int so t should be int , that's why we checked weather it lies within the range of int or not below.
                    quad.add(nums[k - 1]);
                    if (t >= Integer.MIN_VALUE &&
                            t <= Integer.MAX_VALUE && //Confusion
                            quad.contains((int) t)) {

                        List<Integer> list = new ArrayList<>(
                                Arrays.asList(nums[i], nums[j], nums[k], (int) t));
                        Collections.sort(list);
                        set.add(list);
                    }

                }
            }
        }
        List<List<Integer>> all = new ArrayList<>(set);
        return all;
    }
}