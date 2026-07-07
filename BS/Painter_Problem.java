public class Solution {
    public int paint(int A, int B, ArrayList<Integer> C) {
        long min = 0 ;
        long max = 0 ;
        for (int num : C) {
            min = Math.max(min,num);
            max+=num;
        }
        if(A>=C.size()){
            return B*(int)min;
        }
        long l = min ;
        long r = max ;
        long ans = 0 ;
        while(l<=r){
            long count = 1 ;
            long sum = 0;
            long m = l + (r-l)/2;
            for(int num : C){
                if(sum+num<=m){
                    sum+=num;
                }
                else{
                    count++;
                    sum = num;
                    
                }
            }
            if(count<=A){
                ans = m ;
                r = m - 1 ;
            }
            else{
                l = m + 1;
            }
        }
        return (int)(B*ans%10000003);
    }
}
