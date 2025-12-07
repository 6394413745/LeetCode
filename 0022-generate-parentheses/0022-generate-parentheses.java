class Solution {
    public static void printparenthesis(int open,int close,int n,String s,List<String> ans){
         if(s.length() == 2*n){
            ans.add(s);
            return;
         }
        if(open<n)printparenthesis(open+1,close,n,s+"(",ans);
        if(close<open)printparenthesis(open,close+1,n,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        printparenthesis(0,0,n,"",ans);
        return ans;
    }
}