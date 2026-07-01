class Solution {
    int maxLength(int arr[]) {
        int n = arr.length;
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            int sum =0 ;
            for(int j = i ; j < n ; j++){
                sum+=arr[j];
                if(sum==0){
                    max = (max>((j-i)+1))?max:(j-i)+1;
                }
            }
        }
        return max;
    }
}
