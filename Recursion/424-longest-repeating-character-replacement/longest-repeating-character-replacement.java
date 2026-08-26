class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i  = 0 ;
        int j =  0 ;
        int n = s.length();
        int max = 0 ;
        int max_freq = 0 ;
        while(j<n){
            int c = s.charAt(j)-'A';
            map.put(c,map.getOrDefault(c,0)+1);
            max_freq = Math.max(max_freq,map.get(c));
            while((j-i+1) - max_freq > k ){
                c = s.charAt(i)-'A';
                map.put(c,map.getOrDefault(c,0)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max ;
    }
}