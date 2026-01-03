class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(),res);
        return res;

    }
    public static void backtrack(int[] candidates, int target, int start,List<Integer> ans, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i = start;i < candidates.length;i++){

            if(i > start && candidates[i] == candidates[i-1])continue;

            if(candidates[i] > target)break;
            ans.add(candidates[i]);
            backtrack(candidates,target - candidates[i], i + 1,ans,res);
            ans.remove(ans.size() - 1);
        }
    }
}