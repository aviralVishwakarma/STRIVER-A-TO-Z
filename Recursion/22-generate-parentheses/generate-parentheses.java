class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list,0,0,n,"");
        return list;
    }
    public void generate(List<String> list , int left , int right , int n , String s){
        if(s.length()>=n*2){
            list.add(s);
            return;
        }
        if(left<n){
            generate(list,left+1,right,n,s+ "(");
        }
        if(right<left){
            generate(list,left,right+1,n,s+")");
        }

    }

}