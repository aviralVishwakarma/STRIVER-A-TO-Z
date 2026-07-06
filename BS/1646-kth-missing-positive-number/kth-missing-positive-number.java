class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0 ;
        int r = arr.length-1;
        while(l<=r){
            int m = (l+r)/2;
            int missing = arr[m] -(m+1); //Calculates the missing value at myh index.
            if(missing<k){  
                l = m  + 1;
            }
            else{
                r = m - 1;
            }
        }
        return l + k ;
        
    }
}