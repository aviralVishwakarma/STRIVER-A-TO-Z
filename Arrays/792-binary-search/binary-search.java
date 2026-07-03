class Solution {
    public int search(int[] nums, int target) {
        return BS(nums , 0 , nums.length-1 ,target);
    }
    public int BS(int[] nums ,int l , int r ,int target){
        if(l>r) return -1;
        int m = (l+r)/2;
        if(nums[m]==target) return m ;
        else if(nums[m]<target) return BS(nums , m+1 , r , target);
        return BS(nums , l , m-1 , target);
    }
}