class Solution {
    public int[] findPeakGrid(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int low = 0 ;
        int high = n -1 ;
        while(low<=high){
            int mid = (low+high)/2;
            int max = Integer.MIN_VALUE;
            int index = - 1;
            for(int i = 0 ; i < m ; i++){
                if(max<nums[mid][i]){
                    max = nums[mid][i];
                    index = i ;
                }
                
            }
            if ((mid == 0 || nums[mid - 1][index] < nums[mid][index]) &&
                (mid == n - 1 || nums[mid + 1][index] < nums[mid][index])) {
                return new int[]{mid, index};
            }

            if (mid < n - 1 && nums[mid + 1][index] > nums[mid][index]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}

