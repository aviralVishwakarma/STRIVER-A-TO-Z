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

//Iterative Version

/*class Solution {
    public int search(int[] nums, int target) {
        int l = 0 ;
        int r = nums.length-1;
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]==target) return m;
            else if(nums[m]<target) l=m+1;
            else r =m-1;

        }
        return -1;
      
    }
}
*/
//Recursive Version

