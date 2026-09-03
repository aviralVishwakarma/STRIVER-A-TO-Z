class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int even = 0 ;
        int odd = 0 ;
        for(int i = 0 ; i < nums1.length ; i++){
            if(nums1[i]%2==0) even++;
            else odd++;
        }
        if(nums1[0]%2!=0) return true;
        else if(odd==0) return true;
        return false;
    }
}