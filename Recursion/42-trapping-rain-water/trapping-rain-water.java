class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int[] prefix_max = new int[n];
        int[] sufix_max = new int[n];
        prefix_max[0] = height[0];
        for (int j = 1; j < n; j++) {
            prefix_max[j] = Math.max(prefix_max[j-1], height[j]);
        }
        sufix_max[n-1] = height[n-1];
        for (int j = n - 2; j >=0; j--) {
            sufix_max[j] = Math.max(sufix_max[j+1], height[j]);
        }
        for (int i = 0; i < n; i++) {
            int left = prefix_max[i];
            int right = sufix_max[i];
            if(height[i]<left && height[i]<right) water += Math.min(left, right) - height[i];
        }
        return water;
    }
}