class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        ArrayList<int[]> result= new ArrayList<>();
        int start= intervals[0][0];
        int end= intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(end>=intervals[i][0]){
                end= Math.max(end,intervals[i][1]);
            }
            else{
                result.add(new int[]{start,end});
                start= intervals[i][0];
                end= intervals[i][1];
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }
}