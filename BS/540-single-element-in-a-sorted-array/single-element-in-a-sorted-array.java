class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;
        int n = 0 ;
        while(l<=r){
            int m = (l+r)/2;
            if(m+1<nums.length && nums[m]==nums[m+1]){ //Checking if the element lies after m
                if((r-m+1)%2==0){ //Which part contains even no. of elements
                    r = m - 1 ;
                }
                else{
                    l = m + 2;
                }
            }
            else if(m>0 && nums[m-1]==nums[m]){ // if element lies before m
                if((m-l+1)%2==0){ //Which side to shrink
                    l= m +1;
                }
                else{
                    r = m - 2;
                }
            }
            else{
                n = nums[m]; //If no condition is true than nums[m] is our answer
                break;
            }
        }
        return n;
    }
}