class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        generate(0,list,s);
        return ans;
    }
    public void generate(int index,List<String> list, String s){
        if(index==s.length()){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i = index ; i < s.length() ; i++){
            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                generate(i+1,list,s);
                list.remove(list.size()-1);
            }
        }

    }
    public boolean isPalindrome(String s , int start , int end){
        while(start<=end){
            if(s.charAt(start++)==s.charAt(end--)){
                continue;
            }
            else return false;
        }
        return true;
    }
}