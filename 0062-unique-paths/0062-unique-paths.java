class Solution {
    public int paths(int m,int n,int i,int j,int dp[][]){
        if(i==m-1 && n==j-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==m-1){
            return paths(m,n,i,j+1,dp);
        }
        if(j==n-1){
            return paths(m,n,i+1,j,dp);
        }
        dp[i][j]=paths(m,n,i+1,j,dp)+paths(m,n,i,j+1,dp);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return paths(m,n,0,0,dp);
    }
}