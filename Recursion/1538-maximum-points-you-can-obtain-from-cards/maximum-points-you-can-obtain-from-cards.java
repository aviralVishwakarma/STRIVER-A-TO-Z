class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0 ;
        int right = 0 ;
        for(int i = 0 ; i < k ; i++){
            left+=cardPoints[i];
        }
        int sum = left;
        int j = cardPoints.length-1;
        for(int i = k-1 ; i>=0 ; i--){
            left-=cardPoints[i];
            right+=cardPoints[j--];
            sum = Math.max(sum,left+right);
        }
        return sum;
    }
}