class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n ;i++){
            if(set.contains(nums[i])){
                return true;
            }
           set.add(nums[i]);
           if(set.size()>k){
            set.remove(nums[i-k]);
           }
        }
        return false;
    }
}

/* TLE
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //we can treat k+1 as sliding window length
        int i = 0 ;
        int j = k;
        if(k>=nums.length) j =nums.length-1;
        while(j<nums.length){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int l = i ; l <=j ; l++){
                if(map.containsKey(nums[l])){
                    return true;
                }
                map.put(nums[l],1);
            }
            i++;
            j++;
        }
        return false;

    }
}
*/