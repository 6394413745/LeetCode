class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
       Arrays.sort(nums);
       int [] ans = new int[2];
       int idx = 0;
       for(int i = 0;i<n;i+=2){
        if(i == n-1 || nums[i] != nums[i+1]){
            ans[idx++] = nums[i];
            i--;
        }
       } 
       return ans;
    }
}