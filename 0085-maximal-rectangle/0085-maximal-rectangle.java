class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0)return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int [] height = new int[n];
        int [] left = new int[n];
        int [] right = new int[n];

        Arrays.fill(right,n);

        int maxArea = 0;
        for(int i = 0;i<m;i++){
            int currleft = 0,currright = n;

            for(int j =0;j<n;j++){ // for height
                if(matrix[i][j] == '1'){
                    height[j]++;
                }else{
                    height[j] = 0;
                }
            }

            for(int j = 0;j<n;j++){//for left
                if(matrix[i][j] == '1'){
                    left[j] = Math.max(currleft,left[j]);
                }else{
                    left[j] = 0;
                    currleft = j+1;
                }
            }
            for(int j = n-1;j>=0;j--){//for right
                if(matrix[i][j] == '1'){
                    right[j] = Math.min(currright,right[j]);
                }else{
                    right[j] = n;
                    currright = j;
                }
            }
            for(int j = 0;j<n;j++){
                maxArea = Math.max(maxArea,height[j] * (right[j] - left[j]));
            }
        }
        return maxArea;
    }
}