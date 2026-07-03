class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int floor = Integer.MIN_VALUE ;
       int ceil = Integer.MAX_VALUE ;
       int l = 0 ;
       int r = nums.length-1 ;
       while(l<=r){
        int m = l + (r-l)/2;
        if(nums[m]==x){
            floor = x;
            ceil = x ;
            break;
        }
        else if(nums[m]>x){
            ceil = nums[m];
            r = m -1;
        }
        else{
            floor = nums[m];
            l = m + 1;
        }
       }
       if(ceil==Integer.MAX_VALUE){
        ceil=-1;
       }
       if(floor==Integer.MIN_VALUE){
        floor=-1;
       }
       int[] arr = new int[]{floor,ceil};
    return arr;
    }
}
