class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int n = nums.length;
        int m = nums[0].length;
        int l = 0 ;
        int r = n*m-1;
        while(l<=r){
            int mid = (l+r)/2;
            int i = mid/m;
            int j = mid%m;
            if(nums[i][j]==target){
                return true;
            }
            else if(nums[i][j]<target){
                l = mid +1 ;
            }
            else{
                r = mid - 1;
            }
        } 
        return false;
    }
}


//TC O(m+n)
/*
class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int n = nums.length;
        int m = nums[0].length;
        int l = 0 ;
        int r = n*m;
        for(l=0;l<r;l++){
            int i = l/m ;
            int j = l%m;
            if(nums[i][j]==target){
                return true;
            }
        }
        return false;
    }
}
 */