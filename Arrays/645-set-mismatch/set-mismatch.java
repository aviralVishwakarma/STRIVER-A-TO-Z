class Solution {
    public int[] findErrorNums(int[] nums) {
        long n = nums.length;
        long sum_n=(n*(n+1))/2;
        long sum_n_2=(n*(n+1)*(2*n+1))/6;
        long sum = 0 ;
        long sum_2 = 0;
        for(int i = 0 ; i < n ; i ++){
            sum+=nums[i];
            sum_2+=(nums[i])*(nums[i]);
        }
        long dif = sum-sum_n;
        long dif_2 = sum_2-sum_n_2;
        long x = (dif*dif + dif_2)/(2*(dif));
        long y = (dif*dif - dif_2)/(2*(dif));

        int[] arr = new int[2];
        arr[0]=(int)x;
        arr[1]=-(int)y;
        return arr;

    }
}