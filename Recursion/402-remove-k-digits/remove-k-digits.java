class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        int n = num.length();
        int m = k;
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                st.push(num.charAt(i) - '0');
            } else {
                while (!st.isEmpty() && st.peek() > num.charAt(i) - '0' && m > 0) {
                    st.pop();
                    m--;
                }
                st.push(num.charAt(i) - '0');
            }
        }
        while(m>0){
            st.pop();
            m--;
        }
        StringBuilder s = new StringBuilder();
        while(!st.isEmpty()){
            s.append(st.pop());
        }
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)=='0'){
            s.deleteCharAt(i--);
        }
        i = 0 ;
        int j = s.length()-1;
        while(i<j){
            char temp = s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
        return s.length()==0 ? "0" : s.toString();
    }
}