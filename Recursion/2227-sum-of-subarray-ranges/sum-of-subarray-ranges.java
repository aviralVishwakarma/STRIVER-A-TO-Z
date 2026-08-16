class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        int[] nge = new int[n];
        int[] pge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() != n && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() != -1 && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() != n && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() != -1 && nums[st.peek()] < nums[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        long larger = 0;
        long smaller = 0;
        for (int i = 0; i < n; i++) {
            long left_small = i - pse[i];
            long right_small = nse[i] - i;
            long left_large = i - pge[i];
            long right_large = nge[i] - i;
            smaller += (long)nums[i] * left_small * right_small;
            larger += (long)nums[i] * left_large * right_large;
        }
        return larger - smaller;
    }
}