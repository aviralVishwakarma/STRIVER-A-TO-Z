class Solution {
    public int maximumCount(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;
        int lb = lowerBound(nums,l,r);
        int ub = upperBound(nums,l,r);
        return Math.max(lb+1,nums.length-ub);  
    }
    public int lowerBound(int nums[] , int l , int r){
        int lb = -1; // if no negative 1 -1 = 0
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]<0){
                l = m + 1;
                lb= m ;
            }
            else{
                r = m + -1;
            }
        }
        return lb;
    }
    public int upperBound(int nums[] ,int l , int r){
        int ub = nums.length; // if no positive n - n == 0
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]>0){
                r = m - 1;
                ub = m;
            }
            else{
                l = m + 1;
            }
        }
        return ub ;
    }
}