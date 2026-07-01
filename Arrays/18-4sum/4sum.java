class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum==target) {
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        list.add(temp);
                        int temp_k = nums[k];
                        int temp_l = nums[l];
                        while (k < n && nums[k] == temp_k) {
                            k++;
                        }
                        while (l > 0 && nums[l] == temp_l) {
                            l--;
                        }

                    } else if (sum<target) {
                        int temp_k = nums[k];
                        while (k < n && nums[k] == temp_k) {
                            k++;
                        }
                    } else {
                        int temp_l = nums[l];
                        while (l > 0 && nums[l] == temp_l) {
                            l--;
                        }
                    }
                }
            }
        }
        return list;
    }
}

/*int n = nums.length;
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

*/