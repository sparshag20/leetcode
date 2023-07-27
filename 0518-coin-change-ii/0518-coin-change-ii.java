class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return countt(coins,amount,0,dp);
    }
    public int countt(int[] coins,int amount,int ind,int dp[][]){
        if(ind>=coins.length){
            return 0;
        }
        if(amount<0){
            return 0;
        }
        if(amount==0){
            return 1;
        }
        if(dp[ind][amount]!=-1){
            return dp[ind][amount];
        }
        dp[ind][amount]=countt(coins,amount-coins[ind],ind,dp)+countt(coins,amount,ind+1,dp);
        return dp[ind][amount];
    }
}