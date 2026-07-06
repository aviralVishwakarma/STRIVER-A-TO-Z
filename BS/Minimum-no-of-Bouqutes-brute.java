class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max = Integer.MIN_VALUE;
        if (m * k > bloomDay.length) {
            return -1;
        }
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
        }
        for (int i = 1; i <= max; i++) {
            if (check(bloomDay, k, i) >= m)
                return i;
        }
        return -1;
    }

    public int check(int[] bloomDay, int k, int min) {
        int count = 0;
        int curr = 0;
        int i = 0;
        while (i < bloomDay.length) {
            if (curr < k && bloomDay[i] <= min) {
                curr++;
                i++;
                if (curr == k) {
                    curr = 0;
                    count++;
                }
            } else {
                curr = 0;
                i++;
            }
        }
        return count;
    }
}
