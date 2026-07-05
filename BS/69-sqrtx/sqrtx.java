class Solution {
    public int mySqrt(int x) {
        int l = 0 ;
        int r = x ;
        int sqrt = Integer.MIN_VALUE;
        while(l<=r){
            int m = r+(l-r)/2;
            long n = (long)m*m; // m^2 can be out of thr range of int
            if(n==x){
                sqrt = m;
                break;
            }
            else if(n<x){
                sqrt = m;
                l =m+1;
            }
            else{
                r = m -1;
            }
        }
        return sqrt;
    }
}