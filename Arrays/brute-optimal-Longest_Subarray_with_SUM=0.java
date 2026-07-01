//Brute Force
class Solution {
    int maxLength(int arr[]) {
        int n = arr.length;
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            int sum =0 ;
            for(int j = i ; j < n ; j++){
                sum+=arr[j];
                if(sum==0){
                    max = (max>((j-i)+1))?max:(j-i)+1;
                }
            }
        }
        return max;
    }
}

//optimal
class Solution {
    int maxLength(int arr[]) {
        int sum=0;
        int max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
            if(sum==0){
                max=i+1;
            }
            else{
                if(map.containsKey(sum)){
                    max=Math.max(max,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return max;
    }
}
