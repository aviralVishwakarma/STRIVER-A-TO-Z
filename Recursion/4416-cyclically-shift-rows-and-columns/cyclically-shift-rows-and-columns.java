class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i = 0 ; i < n ; i++){
            rotate_row(i,rowShift[i],grid);
        }
        for(int i = 0 ; i < n ; i++){
            rotate_col(i,colShift[i],grid);
        }
        return grid ;
    }
    public void rotate_row(int r , int k ,int[][] grid){
        int i = 0 ;
        int j = k -1;
        while(i<j){
            int temp = grid[r][i];
            grid[r][i] = grid[r][j];
            grid[r][j] = temp;
            i++;
            j--;
        }
        i = k ;
        j = grid.length-1 ;
        while(i<j){
            int temp = grid[r][i];
            grid[r][i] = grid[r][j];
            grid[r][j] = temp;
            i++;
            j--;
        }
        i = 0 ;
        j = grid.length-1 ;
        while(i<j){
            int temp = grid[r][i];
            grid[r][i] = grid[r][j];
            grid[r][j] = temp;
            i++;
            j--;
        }
    }
    public void rotate_col(int c , int k ,int[][] grid){
        int i = 0 ;
        int j = k - 1;
        while(i<j){
            int temp = grid[i][c];
            grid[i][c] = grid[j][c];
            grid[j][c] = temp;
            i++;
            j--;
        }
        i = k ;
        j = grid.length-1 ;
        while(i<j){
            int temp = grid[i][c];
            grid[i][c] = grid[j][c];
            grid[j][c] = temp;
            i++;
            j--;
        }
        i = 0 ;
        j = grid.length-1 ;
        while(i<j){
            int temp = grid[i][c];
            grid[i][c] = grid[j][c];
            grid[j][c] = temp;
            i++;
            j--;
        }
    }
}