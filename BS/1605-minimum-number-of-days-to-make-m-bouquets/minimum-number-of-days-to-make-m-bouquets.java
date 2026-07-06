class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max = Integer.MIN_VALUE;
        if (m * k > bloomDay.length) {
            return -1;
        }
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
        }
        int l = 0 ;
        int r = max;
        int min = -1 ;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(check(bloomDay,k,mid)>=m){
                min = mid;
                r = mid- 1 ;
            }
            else{
                l = mid + 1;
            }
            
        }
        return min;
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