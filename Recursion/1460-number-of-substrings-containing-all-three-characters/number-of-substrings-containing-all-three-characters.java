class Solution {
    public int numberOfSubstrings(String s) {
        int[] map = new int[]{-1,-1,-1};
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            int c = s.charAt(i)-'a';
            map[c]=i;
            count += Math.min(map[0],Math.min(map[1],map[2]))+1;
        }
        return count;
    }
}