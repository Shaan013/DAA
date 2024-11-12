def calculate_minimum_coins(coins, rem, counter):
    if rem < 0:
        return -1
    if rem == 0:
        return 0
    if counter[rem - 1] != float("inf"):
        return counter[rem - 1]
    minimum = float("inf")

    for s in coins:
        result = calculate_minimum_coins(coins, rem - s, counter)
        if result >= 0 and result < minimum:
            minimum = 1 + result

    counter[rem - 1] = minimum if minimum != float("inf") else -1
    return counter[rem - 1]


class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:

        if amount < 1:
            return 0
        return calculate_minimum_coins(coins, amount, [float("inf")] * amount)
