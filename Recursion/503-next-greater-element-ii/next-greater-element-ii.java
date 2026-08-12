class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            int k = nums.length-1;
            int j = (i+1)%(nums.length);
            boolean change = false;
            while(k-->0){
                if(nums[j]>nums[i]){
                    ans[i] = nums[j];
                    change = true;
                    break;
                }
                j = (j+1)%(nums.length);
            }
            if(!change) ans[i] = -1;
        }
        return ans;
    }
}