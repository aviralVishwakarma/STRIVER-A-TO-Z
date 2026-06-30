class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0 ;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            int el = nums[i];
            for(int j = 0 ; j < n ; j++){
                if(nums[j]==el){
                    count++;
                }
            }
            if(count>(n/3)){
                set.add(el);
            }
            count=0;
        }
        List<Integer> list = new ArrayList<>(set);
        return list ;
    }
}