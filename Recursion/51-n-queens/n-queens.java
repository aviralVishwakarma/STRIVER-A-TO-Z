class Solution {
    List<List<String>> list = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] ans = new char[n][n];
        for (int j = 0; j < n * n; j++) {
            ans[j / n][j % n] = '.';
        }
        placeNqueen(0,n,ans);
        return list;
    }

    public void placeNqueen(int row, int n , char[][] ans) {
        if(row==n){
            //add answer
            add(ans,n);
            return;
        }
        for(int col = 0 ; col < n ; col++ ){
            if(isSafe(col,row ,n ,ans)){
                ans[row][col]='Q';
                placeNqueen(row+1,n,ans);
                ans[row][col]='.';
            }
        }
    }
    public void add(char[][] ans , int n){
        List<String> temp = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            StringBuilder s = new StringBuilder();
            for(int j = 0 ; j<n ; j++){
                s.append(ans[i][j]);
            }
            temp.add(s.toString());
        }
        list.add(temp);
    }
    public boolean isSafe(int col , int row , int n , char[][] ans){
        for(int i = 0 ; i < row ; i++){
            if(ans[i][col]=='Q'){
                return false;
            }
        }
        int i = row-1;
        int j = col-1;
        while(i>=0 && j>=0 && i<n && j<n){
            if(ans[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        i = row -1;
        j = col +1;
        while(i>=0 && j>=0 && i<n && j<n){
            if(ans[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

}