def coinChange(self, coins, amount):
        dp = [float('inf')] * (amount + 1)
        dp[0] = 0  # Base case: 0 coins needed to make amount 0

        # Iterate through each coin denomination
        for coin in coins:
            # For each amount from coin to amount, update the minimum number of coins needed
            for i in range(coin, amount + 1):
                dp[i] = min(dp[i], dp[i - coin] + 1)

        # Check if dp[amount] is still float('inf')
        if dp[amount] != float('inf'):
            return dp[amount]
        else:
            return -1
        
