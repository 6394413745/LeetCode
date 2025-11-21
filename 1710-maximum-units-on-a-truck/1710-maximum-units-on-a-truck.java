class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return b[1]-a[1];
            }
        });
        int sum = 0;
        for(int i =0;i<boxTypes.length;i++){
            int nb = boxTypes[i][0];
            int nu = boxTypes[i][1];
            int min = Math.min(nb,truckSize);
            truckSize -= min;
            sum += nu*min;
            if(truckSize == 0){
                return sum;
            }
        }
        return sum;
    }
}