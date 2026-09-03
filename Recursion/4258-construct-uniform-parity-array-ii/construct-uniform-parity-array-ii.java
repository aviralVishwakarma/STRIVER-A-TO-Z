class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE ;
        int even = 0 ;
        int odd = 0 ;
        for(int i = 0 ; i < nums1.length ; i++){
            min = Math.min(min,nums1[i]);
            if(nums1[i]%2!=0) odd++;
        }
        if(min%2!=0) return true;
        else if(odd==0) return true;
        return false;
    }
}