class Solution {
    List<String> ans  = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        generate(map,digits,0,"");
        return ans;
    }
    public void generate(String[] map , String digits , int i , String s){
        if(i==digits.length()){
            ans.add(s);
            return;
        }
        String curr = map[digits.charAt(i)-'0'];
        for(int j = 0 ; j < curr.length() ;j++ ){
            generate(map,digits,i+1,s+curr.charAt(j));
        }
    }
}