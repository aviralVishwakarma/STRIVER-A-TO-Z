class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if(n>m) return findMedianSortedArrays(nums2 , nums1);
        int middle = (n + m + 1)/2;
        int low = 0 ;
        int high = n ;
        while(low<=high){
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            int m1 = (low+high)/2;
            int m2 = middle-m1;
            if(m1<n) r1 = nums1[m1];
            if(m2<m) r2 = nums2[m2];
            if(m1-1>=0) l1 = nums1[m1-1];
            if(m2-1>=0) l2 = nums2[m2-1];
            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    return ((double)Math.max(l1,l2)+ Math.min(r1,r2))/2;
                }
                else{
                    return Math.max(l1,l2);
                }
            }
            else if(l1>r2) high = m1 - 1;
            else low = m1 + 1;
        }
        return -1;
    }
}