class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> set = new ArrayList<>();
        subSequence( set, n , 0 , nums);
        return list;
    }
    public void subSequence(List<Integer> set , int n , int i , int nums[]){
        if(i>=n){
            list.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[i]);
        subSequence(set,n,i+1,nums);
        set.remove(Integer.valueOf(nums[i])); 
        subSequence(set,n,i+1,nums);
    }
}