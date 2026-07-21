class Solution {
    public List<String> generateBinaryStrings(int n) {
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            s.append('0');
        }
        List<String> list = new ArrayList<>();
        stringRecur(0,s,list);
        return list;

        
    }
    public void stringRecur(int i , StringBuilder s , List<String> list){
        if(i>=s.length()){
            list.add(s.toString());
            return;
        }
        stringRecur(i+1,s,list); //Keep 0
        s.setCharAt(i,'1'); //Put 1
        stringRecur(i+2,s,list); //Skip 1 Index
        s.setCharAt(i,'0'); //Backtrack
    }
}
