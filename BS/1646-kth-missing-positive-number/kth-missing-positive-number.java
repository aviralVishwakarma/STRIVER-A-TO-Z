class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0 ;
        int j = 1 ;
        while(k>0){
            if(i < arr.length && arr[i]==j){
                i++;
                j++;
            }
            else{
                j++;
                k--;
            }
        }
        return j-1;
        
    }
}