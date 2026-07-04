class Solution {
    public int findMin(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(l<=r){
            int m = (l+r)/2;
            if(nums[l]==nums[m] && nums[m]==nums[r]){
                min = Math.min(min,nums[m]);
                l++;
                r--;
                continue;
            }
            else if(nums[l]<=nums[m]){
                min = Math.min(min,nums[l]);
                l = m + 1 ;
            }
            else{
                min = Math.min(min,nums[m]);
                r = m - 1 ;
            }
        }
        return min;
    }
}