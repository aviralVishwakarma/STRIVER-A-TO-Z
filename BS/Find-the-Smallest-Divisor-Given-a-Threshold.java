class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        for (int i = 1; i <= max; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % i == 0) {
                    sum += nums[j] / i;
                } else {
                    sum += nums[j] / i + 1;
                }
                ;
            }
            if (sum <= threshold) {
                return i;
            }
        }
        return -1;

    }
}
