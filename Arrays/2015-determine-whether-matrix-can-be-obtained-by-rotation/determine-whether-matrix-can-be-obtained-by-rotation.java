class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int i = 4;
        boolean b ;
        while (i-- > 0) {
            transpose(mat , n);
            reverse(mat , n);
            b = check(mat , target , n);
            if(b==true){
                return b;
            }
        }
        return false;
    }

    public static void transpose(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix ,int n) {
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = n - 1;
            while (j < k) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }
    public static boolean check(int[][] mat , int[][] target , int n ){
        boolean b = true;
        outer:
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j]!=target[i][j]){
                    b = false;
                    break outer;
                }
            }
        }
        return b ;
    }
}