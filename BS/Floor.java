//Floor
class Solution {
    public int findFloor(int[] arr, int x) {
        int l = 0 ;
        int r  = arr.length -1 ;
        int ans = -1 ;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]<=x){
                ans = m ;
                l= m+1;
            }
            else{
                r = m-1 ;
            }
        }
        return ans ;
        
    }
}

//Lower Bound
class Solution {
    public int lowerBound(int[] nums, int x) {
       int l = 0 ;
       int r = nums.length-1;
       int ans = nums.length;
       while(l<=r){
        int m = (l+r)/2;
        if(nums[m]>=x){
            ans = m ;
            r = m -1;
        }
        else{
            l=m+1;
        }
       }
       return ans;
    }
}

