class Solution {
    public int findPages(int[] arr, int k) {
        long min = 0 ;
        long max = 0 ;
        for(int i = 0 ; i < arr.length ; i ++){
            min = Math.max(min,arr[i]);
            max+=arr[i];
        }
        long l = min ;
        long r = max ;
        long ans = -1;
        while(l<=r){
            long m = l + (r-l)/2;
            long count = 1 ;
            long sum = 0 ;
            for(int j = 0 ; j < arr.length ; j++){
                if(sum+arr[j]<=m){
                    sum+=arr[j];
                }
                else{
                    sum=arr[j];
                    count++;
                }
            }
            if(count<=k && k<=arr.length){
                ans = m;
                r = m - 1;
            }
            else{
                l = m + 1;
            }
            
        }
        return (int)ans;
        
    }
}
