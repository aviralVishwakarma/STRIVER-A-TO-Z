class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',-1);
        map.put('b',-1);
        map.put('c',-1);
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            map.put(c,i);
            count += Math.min(map.get('a'),Math.min(map.get('b'),map.get('c')))+1;
        }
        return count;
    }
}