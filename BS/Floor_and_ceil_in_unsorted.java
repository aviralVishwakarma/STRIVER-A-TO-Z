class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int floor = Integer.MIN_VALUE ;
        int ceil =Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(x==arr[i]){
                floor=arr[i];
                ceil=arr[i];
                break;
            }
            else if(x>arr[i]){
                floor = Math.max(arr[i],floor);
            }
            else if(x<arr[i]){
                ceil = Math.min(arr[i],ceil);
            }
        }
        if(floor==Integer.MIN_VALUE){
            floor=-1;
        }
        if(ceil==Integer.MAX_VALUE){
            ceil=-1;
        }
        int[] ans = new int[]{floor,ceil};
        return ans;
        
    }
}
