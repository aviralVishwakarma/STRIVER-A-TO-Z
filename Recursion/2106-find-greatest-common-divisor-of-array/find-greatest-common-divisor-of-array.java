class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        while(max>0){
            int ref  = min%max;
            min = max;
            max = ref;
        }
        return min;
    }
}