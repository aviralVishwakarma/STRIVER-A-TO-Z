class Solution {
    public int reverseDegree(String s) {
        int sum = 0 ; 
        int i = 0 ;
        while(i<s.length()){
            sum+=(26-((int)s.charAt(i)-'a'))*(i+1);
            i++;
        }
        return sum;
    }
}