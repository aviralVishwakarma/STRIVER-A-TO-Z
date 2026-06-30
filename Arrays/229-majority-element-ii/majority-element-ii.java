class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 =0 ;
        int count2 = 0 ;
        int el1 = 0 ;
        int el2 = 0 ;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(count1==0 && nums[i]!=el2){
                count1=1;
                el1=nums[i];
            }
            else if(count2==0 && nums[i]!=el1){
                count2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1){
                count1++;
            }
            else if(nums[i]==el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0 ; 
        count2 = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==el1){
                count1++;
            }
            else if(nums[i]==el2){
                count2++;
            }
        }
        if(count1>(nums.length/3)){
            list.add(el1);
        }
        if(count2>(nums.length/3)){
            list.add(el2);
        }
        return list ;
    
    }
}
    