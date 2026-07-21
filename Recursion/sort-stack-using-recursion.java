class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()) return;
        int top = st.pop();
        sortStack(st);
        sort(top,st);
    }
    public void sort(int top , Stack<Integer> st){
        if(st.isEmpty()){
           st.push(top);
           return; 
        } 
        if(st.peek()>top){
            int el = st.pop();
            sort(top,st);
            st.push(el);
        }
        else{
            st.push(top);
        }
        return;
    }
}
