class Solution {
    public boolean isPalindrome(String s) {
        return check(0,s.length()-1,s);
    }
    public boolean check(int i , int j , String s){
        while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }
        while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }
        if(i>=j) return true;
        if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
            i++;
            j--;
            return check(i,j,s);
        }
        return false;
    }
}

/*

public boolean check(int i , int j , String s){
        if(i>=j) return true;
        if(s.charAt(i)==s.charAt(j) || s.charAt(i)==(char)(s.charAt(j)+32) ||s.charAt(j)==(char)(s.charAt(i)+32)){
            i++;
            j--;
            return check(i,j,s);
        }
        if(s.charAt(i)<'A' || s.charAt(i)>'z' || (s.charAt(i)>'Z' && s.charAt(i)<'a')){
            i++;
            return check(i,j,s);
        }
        if(s.charAt(j)<'A' || s.charAt(j)>'z' || s.charAt(j)>'Z' && s.charAt(j)<'a'){
            j--;
            return check(i,j,s);
        }
        return false;
    } 
 */