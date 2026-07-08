class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int n = nums.length;
        int m = nums[0].length;
        for(int i = 0 ; i < n*m ; i++){
            int j = i/m;
            int k = i%m;
            if(target==nums[j][k]){
                return true;
            }
        }
        return false;
    }
}