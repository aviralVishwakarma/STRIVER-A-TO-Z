class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int i  = 0 ;
        int j =  0 ;
        int n = s.length();
        int max = 0 ;
        int max_freq = 0 ;
        while(j<n){
            int c = s.charAt(j)-'A';
            map[c]++;
            max_freq = Math.max(max_freq,map[c]);
            while((j-i+1) - max_freq > k ){
                c = s.charAt(i)-'A';
                map[c]--;
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max ;
    }
}