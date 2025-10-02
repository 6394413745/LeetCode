class Solution {
    public String longestPalindrome(String s) {
        if(s == null ||s.length() < 1)return " ";
        int st = 0,end = 0;
        for(int i =0;i<s.length();i++){
            int odd = check(s,i,i);
            int even = check(s,i,i+1);
            int max = Math.max(odd,even);
            if (max > end - st) {
                st = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(st, end + 1);
    }
    public int check(String s,int l,int r){
        while(l >= 0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l -1;
    }

}