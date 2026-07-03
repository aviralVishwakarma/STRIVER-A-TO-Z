class Solution {
    public int findCeil(int[] arr, int x) {

        int ans = -1;

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (arr[m] >= x) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }
}
