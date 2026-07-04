class Solution {
    int countFreq(int[] arr, int target) {
        int start = lowerBound(arr,target) ;
        if(start==arr.length || arr[start]!=target) return 0;
        int end = upperBound(arr,target);
        return end -start ;
    }
    public int lowerBound(int[] arr , int target){
        int l = 0 ;
        int r =arr.length-1;
        int lb = arr.length;
        while(l<=r){
            int m = l + (r-l)/2;
            if(arr[m]>=target){
                lb = m ;
                r = m -1 ;
            }
            else{
                l = m+1;
            }
        }
        return lb;
    }
    public int upperBound(int[] arr , int target){
        int l = 0 ;
        int r =arr.length-1;
        int ub = arr.length;
        while(l<=r){
            int m = l + (r-l)/2;
            if(arr[m]>target){
                ub = m ;
                r = m -1;
            }
            else{
                l = m+1;
            }
        }
        return ub;
    }
}
