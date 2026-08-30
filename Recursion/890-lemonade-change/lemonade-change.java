class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < bills.length ; i++){
            map.put(bills[i],map.getOrDefault(bills[i],0)+1);
            int rem = bills[i]-5;
            if(rem==0) continue;
            else if(rem==5){
                if(map.containsKey(5)){
                    map.put(5,map.get(5)-1);
                    if(map.get(5)==0){
                        map.remove(5);
                    }
                }
                else{
                    return false;
                }
            }
            else{
                if(map.containsKey(5) && map.containsKey(10)){
                    map.put(5,map.get(5)-1);
                    if(map.get(5)==0){
                        map.remove(5);
                    }
                    map.put(10,map.get(10)-1);
                    if(map.get(10)==0){
                        map.remove(10);
                    }
                }
                else if(map.containsKey(5) && map.get(5)>=3){
                    map.put(5,map.get(5)-3);
                    if(map.get(5)==0){
                        map.remove(5);
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}