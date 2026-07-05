class Solution {
    public int countNegatives(int[][] grid) {
        int l = 0 ;
        int r = grid[0].length-1;
        int count = 0 ;
        for(int i = 0 ; i < grid.length ; i++){
            count += r - negativeNumber(grid[i], l , r) + 1;
        }
        return count ;
    }
    public int negativeNumber(int[] nums ,int l ,int r){
        int lb = r + 1 ;
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]<0){
                lb = m ;
                r = m -1;
            }
            else{
                l = m + 1;
            }
        }
        return lb;
    }
}