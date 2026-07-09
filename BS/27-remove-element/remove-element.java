class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0 ;
        int j = 0 ;
        int n = nums.length;
        while(i<n && j<n){
            if(nums[i]==val){
                while(j<n && nums[j]==val){
                    j++;
                }
                if(j<n){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                }
            }
            else{
                i++;
                j++;
            }
        }
        return i;
    }
}