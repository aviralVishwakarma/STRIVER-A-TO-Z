class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return count_subarray(nums,goal) - count_subarray(nums,goal-1);
    }
    public int count_subarray(int[] nums , int k){
        if(k<0) return 0 ;
        int sum =  0 ;
        int i = 0 ;
        int j = 0 ;
        int count = 0 ;
        int n = nums.length;
        while(j<n){
            sum+=nums[j];
            while(sum>k){
                sum-=nums[i];
                i++;
            }
            count+=(j-i+1);
            j++;
        }
        return count;
    }
}