public class Solution {
    int count = 0 ;
    public int countInversions(int[] A) {
        int l = 0 ;
        int r = A.length-1;
        mergeSort(A,l,r);
        return count;
        
    }
    public void mergeSort(int[] A ,int l ,int r){
        if(l>=r)return;
        int m = (l+r)/2;
        mergeSort(A,l,m);
        mergeSort(A,m+1,r);
        merge(A,l,m,r);
        
    }
    public void merge(int[] A ,int l , int m, int r){
        int left = l;
        int right = m+1;
        int temp[] = new int[r-l+1];
        int k = 0;
        while(right<=r && left<=m){
            if(A[left]<=A[right]){
               temp[k++]=A[left++]; 
            }
            else{
                temp[k++]=A[right++];
                count += (m - left + 1);//Issue
            }
        }
        while(left<=m){
            temp[k++]=A[left++];
        }
        while(right<=r){
            temp[k++]=A[right++];
        }
        for(int i = l; i <= r; i++){
            A[i] = temp[i-l];
        }
    }
}
