class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = n*n;
        int even = (n)*(n+1);
        int min = Math.min(odd,even);
        int ans = 1;
        for(int i = min ; i>=1 ; i--){
            if(odd%i==0 && even%i==0){
                return i;
            }
        }
        return -1;
    }
}