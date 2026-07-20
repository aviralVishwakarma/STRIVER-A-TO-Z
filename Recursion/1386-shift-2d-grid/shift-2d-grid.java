class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int l = m * n;
        k = k%l;
        while (k-- > 0) {
            int temp = grid[m - 1][n - 1];
            for (int i = l-1; i>0; i--) {
                grid[i / n][i % n] = grid[(i -1) / n][(i-1) % n];
            }
            grid[0][0] = temp;
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int[] row : grid) {
            List<Integer> temp = new ArrayList<>();

            for (int num : row) {
                temp.add(num);
            }

            list.add(temp);
        }
        return list;
    }
}