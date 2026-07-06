class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        int l = 1;
        int r = max;
        int ans = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % m == 0) {
                    sum += nums[j] / m;
                } else {
                    sum += nums[j] / m + 1;
                }
                ;
            }
            if (sum <= threshold) {
                ans = m;
                r = m - 1;

            } else {
                l = m + 1;
            }
        }
        return ans;

    }
}