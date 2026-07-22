class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        generate(0,nums,list);
        return ans;
    }
    public void generate(int i , int[] arr , List<Integer> list){
        if(i>=arr.length){
            ans.add(new ArrayList(list));
            return;
        }
        list.add(arr[i]);
        generate(i+1,arr,list);
        list.remove(list.size()-1);
        while(i<arr.length-1 && arr[i]==arr[i+1]) i++;
        generate(i+1,arr,list);
    }
}