public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0; 
    for (int i = 0; i < coins.length; i++) {
        int coin = coins[i];
        for (int j = coin; j <= amount; j++) {
            if (dp[j - coin] != Integer.MAX_VALUE) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }
    }
    if (dp[amount] != Integer.MAX_VALUE) {
        return dp[amount];
    } 
    else{
        return -1;
    }
}
