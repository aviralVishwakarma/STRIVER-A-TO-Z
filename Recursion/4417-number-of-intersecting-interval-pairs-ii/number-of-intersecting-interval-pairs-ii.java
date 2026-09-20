class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        long count = 0 ;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0 ; i < intervals.length ; i ++){
            int high = intervals[i][1];
            int l = i ;
            int r =  intervals.length;
            int m = 0 ;
            int prev = i;
            while(l<r){
                m = (l+r)/2;
                if(intervals[m][0]<=high){
                    prev = m ;
                    l = m + 1 ;
                }
                else{
                    r = m  ;
                }
            }
            count += l - i - 1;
        }
        return count ;
    }
}