class Solution {
    public int nthRoot(int n, int m) {
        int l = 0 ;
        int r = m ;
        while(l<=r){
                int mid = (r+l)/2; //always divided with 2 no matter which root we are calculating
                int nth = 1;
                for(int i = 0 ; i < n ; i++){
                    nth*=mid;
                }
                if(nth==m){
                    return mid;
                }
                else if(nth<m){
                    l = mid +1;
                }
                else{
                    r = mid -1;
                }
        }
        return - 1;
        
    }
}
