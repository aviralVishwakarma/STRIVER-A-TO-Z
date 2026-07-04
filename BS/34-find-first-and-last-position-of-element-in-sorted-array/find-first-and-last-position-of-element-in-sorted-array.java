class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0 ;
        int r = nums.length-1;
        int start =lowerBound(nums,target);
        if(start==nums.length || nums[start]!=target) return new int[]{-1,-1};
        int end = upperBound(nums,target)-1;
        int[] arr = new int[]{start,end};
        return arr;

    }
    public int lowerBound(int[] nums ,int target){
        int l = 0 ;
        int r = nums.length-1 ;
        int lb = nums.length;
        while(l<=r){
            int m = l + (r-l)/2;
            if(nums[m]>=target){
                lb=m;
                r =  m-1 ;
            }
            else{
                l = m +1;
            }
        }
        return lb;
    }

    public int upperBound(int nums[] , int target){
        int l = 0;
        int r = nums.length-1;
        int ub = nums.length;
        while(l<=r){
            int m = l + (r-l)/2;
            if(nums[m]>target){
                ub = m ;
                r = m -1 ;
            }
            else{
                l = m +1;
            }
        }
        return ub;
    }
}