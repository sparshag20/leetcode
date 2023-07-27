class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] =new int[text1.length()][text2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }

        return longSub(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
    public int longSub(String t1,String t2,int ind1,int ind2,int[][] dp){
        if(ind1<0 || ind2<0){
            return 0;
        }    
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(t1.charAt(ind1)==t2.charAt(ind2)){
            return dp[ind1][ind2]= 1+longSub(t1,t2,ind1-1,ind2-1,dp);
        }
        return dp[ind1][ind2]=0+Math.max(longSub(t1,t2,ind1-1,ind2,dp),longSub(t1,t2,ind1,ind2-1,dp));
    }
}