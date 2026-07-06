class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < weights.length; i++) {
            min = Math.max(min, weights[i]);
            max += weights[i];
        }
        int l = min ;
        int r = max ;
        int min_weight = 0;
        while(l<=r){
            int current_weight = 0;
            int current_days = 1;
            int m = l + (r-l)/2;
            for (int j = 0; j < weights.length; j++) {
                if (current_weight + weights[j] <= m) {
                    current_weight += weights[j];
                } else {
                    current_days++;
                    current_weight = weights[j];
                }
            }
            if(current_days<=days){
                r = m - 1;
                min_weight = m;
            }
            else{
                l = m + 1;
            }
        }

        return min_weight;
    }
}