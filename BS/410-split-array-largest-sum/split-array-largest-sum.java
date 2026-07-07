class Solution {
    public int splitArray(int[] nums, int k) {
        int min = Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            min = Math.max(min, nums[i]);
            max += nums[i];
        }
        int l = min;
        int r = max;
        int ans =0 ;
        while(l<=r){
            int m = r +(l-r)/2;
            int count = 1;
            int sum = 0;
            for(int j = 0 ; j < nums.length ; j ++){
                if(sum+nums[j]<=m){
                    sum+=nums[j];
                }
                else{
                    count++;
                    sum = nums[j];
                }
            }
            if(count<=k){
                ans = m;
                r = m - 1;
            }
            else{
                l = m +1;
            }
        }
        return ans ;
    }
}