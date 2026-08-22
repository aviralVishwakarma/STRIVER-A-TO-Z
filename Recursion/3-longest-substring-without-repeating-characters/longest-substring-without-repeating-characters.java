class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max_length = 0;
        int l = 0 ;
        int r = 0 ;
        while(r<s.length()){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            else{
                set.add(s.charAt(r));
                r++;
            }
            max_length = Math.max(max_length,r-l);
        }
        return max_length;
    }
}