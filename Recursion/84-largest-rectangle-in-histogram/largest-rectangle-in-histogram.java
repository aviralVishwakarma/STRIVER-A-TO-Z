class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int nse[] = new int[n];
        for (int i = n-1; i>=0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st.clear();
        int[] pse = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int left = i - pse[i];
            int right = nse[i]  - i;
            max = Math.max(max,(right+left-1)*heights[i]);
        }
        return max;
    }
}