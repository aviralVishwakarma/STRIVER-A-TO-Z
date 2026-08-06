class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            String num = ""+n;
            int i = 0 ;
            int mul = 1;
            while(i<num.length()){
                mul*=(num.charAt(i)-'0');
                i++;
            }
            if(mul%t==0) return n;
            n++;
        }
    }
}