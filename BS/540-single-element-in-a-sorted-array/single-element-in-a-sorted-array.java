class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;
        int n = 0 ;
        while(l<=r){
            int m = (l+r)/2;
            if(m+1<nums.length && nums[m]==nums[m+1]){
                if((r-m+1)%2==0){
                    r = m - 1 ;
                }
                else{
                    l = m + 2;
                }
            }
            else if(m>0 && nums[m-1]==nums[m]){
                if((m-l+1)%2==0){
                    l= m +1;
                }
                else{
                    r = m - 2;
                }
            }
            else{
                n = nums[m];
                break;
            }
        }
        return n;
    }
}