class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int startT = intervals[0][0];
        int endT = intervals[0][1];

        for(int i =1;i<intervals.length;i++){
            int currStartT = intervals[i][0];
            int currEndT = intervals[i][1];
            if(currStartT <= endT){
                endT = Math.max(endT,currEndT);
            }else{
                result.add(new int[]{startT,endT});
                startT = currStartT;
                endT = currEndT;
            }
        }
        result.add(new int[]{startT,endT});
        return result.toArray(new int[result.size()][]);
        
    }
}