class Solution {
    public int trap(int[] height) {
        int i = 0 ;
        int j = height.length-1;
        int left_max = height[i];
        int right_max = height[j];
        int water = 0 ;
        while(i<j){
            if(height[i]<=height[j]){
                if(height[i]>=left_max){
                    left_max = height[i];
                }
                else{
                    water+=left_max - height[i];
                }
                i++;
            }
            else{
                if(height[j]>=right_max){
                    right_max = height[j];
                }
                else{
                    water+=right_max-height[j];
                }
                j--;
            }
        }
        return water;
    }
}