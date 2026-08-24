class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int i = 0;
        int j = 0;
        int zero = 0;
        int n = nums.length;
        while (j < n) {
            if(nums[j]==0){
                zero++;
            }
            while(zero>k){
                if(nums[i]==0) zero--;
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
            
        }
        return max;
    }
}