class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_ind = 0 ;
        int max_ind = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]<=min){
                min = nums[i];
                min_ind = i ;
            }
            if(nums[i]>max){
                max = nums[i];
                max_ind = i;
            }
        }
        int both = 0 ;
        int left = 0 ;
        int right = 0 ;
        if(min_ind<=max_ind){
            both = (min_ind+1) + (nums.length-max_ind);
            left = max_ind+1;
            right = (nums.length-min_ind);
        }
        else{
            both = (max_ind+1) + (nums.length-min_ind);
            left = min_ind+1;
            right = (nums.length-max_ind);
        }
        return Math.min(both,Math.min(left,right));
    }
}