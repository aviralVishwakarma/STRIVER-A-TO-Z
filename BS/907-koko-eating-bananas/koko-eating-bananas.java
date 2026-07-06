class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < piles.length ; i++){
            max = Math.max(max,piles[i]);
        }
        int l = 1 ; 
        int r = max ;
        int k = 0 ;
        while(l<=r){
            int m = r+(l-r)/2;
            long curr_h = 0 ;
            for(int i = 0 ; i < piles.length ; i++){
                if(piles[i]%m==0){
                    curr_h+=piles[i]/m;
                }
                else{
                    curr_h+=piles[i]/m+1;
                }
            }
            if(curr_h<=h){
                k = m ;
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return k ;
    }
}