class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long total = 1;
        long even = 1;
        long prime = 0;
        if ((n & 1) == 1) {
            even = n / 2 + 1;
            prime = n / 2;
        } else {
            even = n / 2;
            prime = n / 2;
        }
        total = (pow(4, prime, 1L)) * (pow(5, even, 1L)) % MOD;
        return (int) (total);
    }

    public long pow(long x, long n, long ans) {
        if (n == 0)
            return ans;
        if ((n & 1) == 1) {
            ans = (ans * x) % MOD;
        }
        x = (x * x) % MOD;
        n >>= 1;
        return pow(x, n, ans);
    }
}