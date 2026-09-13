class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0  ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count = 0 ;
        for(int key : map.keySet()){
            if(map.get(key)==3){
                int i = 0 ;
                while(i<nums.length && nums[i]!=key){
                    i++;
                }
                int j = i +1;
                while(j<nums.length && nums[j]!=key){
                    j++;
                }
                if(j+(j-i) < nums.length && nums[j+(j-i)]==key) count++;
            }
        }
        return count;
    }
}