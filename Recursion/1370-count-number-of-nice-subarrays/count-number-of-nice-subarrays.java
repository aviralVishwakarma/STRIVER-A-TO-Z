class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return subarray(nums,k) - subarray(nums,k-1);
    }
    public int subarray(int[] nums , int k){
        int i = 0 ;
        int j = 0 ;
        int count = 0 ;
        int sum = 0 ;
        int n = nums.length;
        while(j<n){
            sum+=((nums[j])&1)==0? 0 : 1;
            while(k<sum){
                sum-=((nums[i++])&1)==0? 0 : 1;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}