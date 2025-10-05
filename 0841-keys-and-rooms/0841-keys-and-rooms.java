class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        vis[0] = true;
        dfs(0,vis,adj);
        for(boolean ele : vis){
            if(ele == false)return false;
        }
        return true;
    }
    public static void dfs(int st, boolean[] vis,List<List<Integer>> adj){
        int n = adj.size();
        vis[st] = true;
        for(int ele: adj.get(st)){
            if(!vis[ele]){
                dfs(ele,vis,adj);
            }
        }
        
    }
}