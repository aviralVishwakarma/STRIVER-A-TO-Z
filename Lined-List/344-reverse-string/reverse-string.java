class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        reverse(i,j,s);

    }
    public void reverse(int i , int j ,char[] s){
        if(i>=j) return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverse(++i,--j,s);
    }
}