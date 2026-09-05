class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();
        boolean isInserted = false ;
        for(int i = 0 ; i < n ; i++){
            if(!isInserted && newInterval[0]<intervals[i][0]){
                list.add(newInterval);
                isInserted = true;
            }
            list.add(intervals[i]);
        }
        if(!isInserted){
            list.add(newInterval);
        }
        int i = 0;
        while(i<list.size()-1){
            if(list.get(i)[1]>=list.get(i+1)[0]){
                list.set(i,new int[]{list.get(i)[0],Math.max(list.get(i)[1],list.get(i+1)[1])});
                list.remove(i+1);
            }
            else{
                i++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}