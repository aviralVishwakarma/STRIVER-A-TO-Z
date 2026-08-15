class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int asteroid = arr[i];
            boolean destroyed = false;
            while (!st.isEmpty() && st.peek() > 0 && asteroid<0) {
                if (st.peek() < -asteroid) {
                    st.pop();
                } else if (st.peek() == -asteroid) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed) st.push(arr[i]);
        }
        int n = st.size();
        int[] ans = new int[n];
        for (int i = n-1; i>=0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}