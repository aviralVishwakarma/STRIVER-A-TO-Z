class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int len = nums1.length + nums2.length;
        int ind2 = len / 2;
        int ind1 = len / 2 - 1;
        int count = 0;
        int ind_el1 = -1;
        int ind_el2 = -1;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (count == ind2)
                    ind_el2 = nums1[i];
                if (count == ind1)
                    ind_el1 = nums1[i];
                count++;
                i++;
            } else {
                if (count == ind2)
                    ind_el2 = nums2[j];
                if (count == ind1)
                    ind_el1 = nums2[j];
                count++;
                j++;
            }
        }
        while (j < nums2.length) {
            if (count == ind2)
                ind_el2 = nums2[j];
            if (count == ind1)
                ind_el1 = nums2[j];
            count++;
            j++;
        }
        while (i < nums1.length) {
            if (count == ind2)
                ind_el2 = nums1[i];
            if (count == ind1)
                ind_el1 = nums1[i];
            count++;
            i++;
        }
        if((nums1.length+nums2.length)%2==0){
            return ((double)ind_el1+ind_el2)/2;
        }
        else{
            return ind_el2;
        }
    }
}
