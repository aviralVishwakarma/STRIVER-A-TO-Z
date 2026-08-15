class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        for(int i = n -1 ; i >=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = 0 ; i < n ; i ++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }
        long ans = 0 ;
        long mod = 1_000_000_007L;
        for(int i = 0 ; i < n ; i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            long contribution = left*right*arr[i];
            ans = (ans+contribution)%mod; 
        }
        return (int)ans;
    }
}