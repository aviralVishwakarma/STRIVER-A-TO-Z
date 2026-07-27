class Solution {
    public int maximumProduct(int[] nums) {
        int neg_one = Integer.MAX_VALUE;
        int neg_two = neg_one;
        int pos_one = Integer.MIN_VALUE;
        int pos_two = pos_one;
        int pos_three = pos_two;
        for(int i = 0 ; i < nums.length ; i++){
                if(nums[i]>=pos_one){
                    pos_three = pos_two;
                    pos_two = pos_one;
                    pos_one = nums[i];
                }
                else if (nums[i]>pos_two){
                    pos_three=pos_two;
                    pos_two = nums[i];
                }
                else if(nums[i]>pos_three){
                    pos_three = nums[i];
                }
                if(nums[i]<=neg_one){
                    neg_two = neg_one;
                    neg_one = nums[i];
                }
                else if(neg_two>nums[i]){
                    neg_two = nums[i];
                    
                }
        }
        return Math.max(pos_one*pos_two*pos_three,neg_one*neg_two*pos_one);
    }
}