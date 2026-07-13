class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String str = "123456789";
        int n = low;
        int size = 0;
        while (n > 0) {
            size++;
            n = n / 10;
        }
        for (int i = size; i <= 9; i++) {
            int j = 0;
            int k = i;
            while (k <= 9) {
                if (Integer.parseInt(str.substring(j, k)) <= high && Integer.parseInt(str.substring(j, k)) >= low) {
                    list.add(Integer.parseInt(str.substring(j, k)));
                }
                j++;
                k++;
            }
        }
        return list;

    }
}