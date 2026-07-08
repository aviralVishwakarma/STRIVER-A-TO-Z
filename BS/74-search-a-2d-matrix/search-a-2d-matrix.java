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