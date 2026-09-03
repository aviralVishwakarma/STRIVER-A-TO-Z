class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int min = 0 ;
        int max = 0;
        for(int i = 0 ; i < nums.length-1; i++){
            max = Math.max(max,nums[i]+i);
            if(min==i){
                jump++;
                min = max;
            }
        }
        return jump;
    }

}