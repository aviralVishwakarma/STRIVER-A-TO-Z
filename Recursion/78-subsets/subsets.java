class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = 1<<(nums.length);
        int len = nums.length;
        for(int i = 0 ; i <1<<(nums.length); i++){
            int j = 0 ;
            int temp = n;
            ArrayList<Integer> list = new ArrayList<>();
            while(j<nums.length){
                if((temp&1)==1) list.add(nums[j]);
                j++;
                temp = temp>>1;
            }
            ans.add(list);
            n = n+1;
        }
        return ans;
    }
}