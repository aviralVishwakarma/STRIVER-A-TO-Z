class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0 ;
        int i = g.length-1 ;
        int j = s.length-1 ;
        while(j>=0 && i>=0){
            if(g[i]<=s[j]){
                count++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        return count;
    }
}