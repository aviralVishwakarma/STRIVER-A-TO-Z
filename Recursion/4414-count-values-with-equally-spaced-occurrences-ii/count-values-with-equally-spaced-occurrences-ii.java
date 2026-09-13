class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0  ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count = 0 ;
        for(int key : map.keySet()){
            if(map.get(key)>=3){
                int i = 0 ;
                int occ = map.get(key)-2;
                while(i<nums.length && nums[i]!=key){
                    i++;
                }
                int j = i +1;
                while(j<nums.length && nums[j]!=key){
                    j++;
                }
                int diff = (j-i);
                i = j+diff;
                boolean bool = true ;
                while(i<nums.length && occ>0){
                    if(nums[i]!=key) bool = false;
                    occ--;
                    i+=diff;
                }
                if(bool && occ==0) count++;
            }
        }
        return count;
    }
}