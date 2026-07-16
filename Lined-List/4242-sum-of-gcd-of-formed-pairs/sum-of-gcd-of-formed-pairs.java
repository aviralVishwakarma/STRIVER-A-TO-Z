class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            int temp = gcd(nums[i], max);
            nums[i] = temp;
        }
        int i = 0;
        int j = nums.length-1;
        long sum = 0;
        Arrays.sort(nums);
        while(i<j){
            sum += gcd(nums[i++],nums[j--]);
        }
        return sum;

    }

    public int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}