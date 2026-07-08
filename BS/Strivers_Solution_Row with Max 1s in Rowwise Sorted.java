//Row with Max 1s in Rowwise Sorted
class Solution {
    public int rowWithMax1s(int[][] arr) {
        int max = 0;
        int index = -1;
        for(int i = 0 ; i < arr.length ; i++){
            int x = upperbound(arr[i]);
            if(max<arr[i].length-x-1){
                index = i;
                max = arr[i].length-x-1; 
            }
        }
        return index;
    }
    public int upperbound(int arr[]){
        int l = 0 ;
        int r = arr.length-1;
        int index = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]<=0){
                index = mid;
                l = mid + 1;
            }
            else{
                r = mid -1;
            }
        }
        return index;
    }
}

//TC nlog(m) 
