class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int x = 31;
        long q = 0;
        while (a != 0 && x >= 0) {
            if ((b << x) <= a) {
                q += (1L << x);
                a -= (b << x);
            }
            x--;
        }
        return negative ? (int) -q : (int) q;
    }
}