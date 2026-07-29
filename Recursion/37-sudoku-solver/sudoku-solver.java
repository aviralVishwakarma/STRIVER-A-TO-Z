class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0);
    }
    public boolean solve(char[][] board ,int index){
        if(index==81){
            return true;
        }
        int i = index/9;
        int j = index%9;
        if(board[i][j]!='.'){
            return solve(board,index+1);
        }
        for(int number = 1 ; number<=9 ; number++){
            if(check(board,i,j,number)){
                board[i][j] = (char)(number+'0');
                if(solve(board,index+1)){
                    return true;
                }
                board[i][j] = '.';
            }
        }
        return false;
    }
    public boolean check(char[][] board,int i , int j ,int number){
        for(int k = 0 ; k< 9 ; k++){
            if(board[i][k]==(char)(number+'0') && k!=j ){
                return false;
            }
            if(board[k][j]==(char)(number+'0') && k!=i){
                return false;
            }
        }
        int i_start = 3*(i/3);
        int i_end = i_start+3;
        int j_start = 3*(j/3);
        int j_end = j_start + 3;
        for(int k = i_start; k<i_end ; k++){
            for(int l = j_start ; l<j_end ; l++){
                if(k==i && l==j){
                    continue;
                }
                else if(board[k][l]==(char)(number+'0')){
                    return false;
                }
            }
        }
        return true;
    }
}