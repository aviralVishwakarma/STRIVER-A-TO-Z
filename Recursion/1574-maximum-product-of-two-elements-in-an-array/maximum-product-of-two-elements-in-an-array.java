class Solution {
    public int maxProduct(int[] nums) {
        int max_first = Integer.MIN_VALUE;
        int max_second = max_first;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]>=max_first){
                max_second = max_first;
                max_first = nums[i];
            }
            if(nums[i]<max_first && nums[i]>max_second){
                max_second = nums[i];
            }
        }
        return (max_first-1)*(max_second-1);
    }
}