class Solution {
    public boolean validPath(int n, int[][] edges, int st, int dest) {
        if(st == dest)return true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i = 0;i<edges.length;i++){
            int a = edges[i][0],b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] vis = new boolean[n];
        vis[st] = true;
        bfs(st,adj,vis);
        return vis[dest];
        
    }
    private void bfs(int st, List<List<Integer>> adj, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(st);
        while(q.size()>0){
            int front = q.remove();
            for(int ele: adj.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }
    }
}