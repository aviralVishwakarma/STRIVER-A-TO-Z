class Solution {
    public int upperBound(int[] nums, int x) {
        int l = 0 ;
        int r = nums.length-1;
        int ans = nums.length;
        while(l<=r){
            int m = l+(r-l)/2; //Int max safety
            if(nums[m]>x){
                ans = m ;
                r = m -1 ;
            }
            else{
                l = m +1;
            }
        }
        return ans;
    }
}
