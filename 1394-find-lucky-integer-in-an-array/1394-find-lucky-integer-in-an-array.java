class Solution {
    public int findLucky(int[] arr) {
        int max = 0;
        int maxfreq = -1;
        for(int x: arr){
            if(x>max){
                max = x;
            }
        }
        int[] freq = new int[max+1];
        for(int x:arr){
            freq[x]++;
        }
        for(int i = 1;i<=max;i++){
            if(i==freq[i])
             maxfreq = i;
        }
        return maxfreq;
    }
}