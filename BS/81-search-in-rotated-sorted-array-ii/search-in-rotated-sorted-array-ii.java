class Solution {
    public boolean search(int[] nums, int target) {
        return BS(nums,target,0,nums.length-1);
       
    }
    public boolean BS(int[] nums , int target , int l , int r){
         while(l<=r){
            int m = l + ( r - l )/2;
            if(nums[m]==target){
                return true;
            }
            else if(nums[m]==nums[l] && nums[m]==nums[r]){
                boolean a = BS(nums,target,l,m-1);
                boolean b = BS(nums,target,m+1,r);
                if(a==true) return true;
                else if(b==true) return true;
                else return false;
            }
            else if(nums[m]>=nums[l]){
                if(nums[m]>=target && target>=nums[l]){
                    r = m -1;
                }
                else{
                    l = m + 1;
                }
            }
            else{
                if(nums[m]<=target && target<=nums[r]){
                    l = m +1 ;
                }
                else{
                    r = m - 1;
                }
            }
        }
        return false;
    }
}