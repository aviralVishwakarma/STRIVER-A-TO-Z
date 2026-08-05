class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                i+=2;
            }
            else{
                ans[j++] = nums[i++];
            }
        }
        if(i!=nums.length){
            ans[j] = nums[nums.length-1];
        }
        return ans;
    }
}