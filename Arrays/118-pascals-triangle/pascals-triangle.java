class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] p = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            int[] arr = new int[i+1];
            arr[0] = 1;
            arr[arr.length - 1] = 1;
            for (int j = 1; j < i; j++) {
                arr[j] = p[i - 1][j] + p[i - 1][j - 1];
            }
            p[i] = arr;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] row : p) {
            List<Integer> list = new ArrayList<>();

            for (int num : row) {
                list.add(num);
            }

            ans.add(list);
        }
        return ans;
    }
}