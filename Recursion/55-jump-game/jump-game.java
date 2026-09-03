class Solution {
    public boolean canJump(int[] nums) {
        int max = 0 ;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]>0){
                max= Math.max(max,i+nums[i]);
            }
            else{
                if(i>=max && i!=n-1) return false;
            }
        }
        return true;
    }
}