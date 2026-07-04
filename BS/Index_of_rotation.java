class Solution {
    public int findKRotation(int arr[]) {
        int l = 0 ;
        int r = arr.length-1;
        int i = 0;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[l]<=arr[m]){
                if(ans>arr[l]){
                    ans=arr[l];
                    i = l;
                }
                l = m + 1 ;
            }
            else{
                if(arr[m]<ans){
                    ans = arr[m];
                    i = m ;
                }
                r = m - 1;
            }
        }
        return i;
        
    }
}
