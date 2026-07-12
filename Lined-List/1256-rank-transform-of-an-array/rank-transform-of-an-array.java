class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = new int[arr.length];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                continue;
            }
            else{
                map.put(nums[i],rank);
                rank++;
            }
        }
        for(int i = 0 ; i < nums.length; i++){
            rank = map.get(arr[i]);
            arr[i] = rank;
        }
        return arr;
    }
}