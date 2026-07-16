class Solution {
    public int myAtoi(String s) {
        if(s==null || s.length()==0)return 0;
        int i = 0;
        while(i<s.length() && s.charAt(i)==' '){
            ++i;
        }
        int sign=1;
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign = (s.charAt(i)=='-')? -1 : 1;
            i++;
        }
        long result = 0L;
        return convert(i,s,sign,result);
    }
    public int convert(int i , String s , int sign , long result){
        if(s.length()<=i || !Character.isDigit(s.charAt(i))) return sign*(int)result;
        result  = result*10 + (s.charAt(i)-'0');
        if(result*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return convert(++i,s,sign,result);
    }
}