package sweeft.acceleration.task;

import sweeft.acceleration.task.exception.NotPositiveValueException;

public class MoneyExchange {
    private static final int[] COINS = {50, 20, 10, 5, 1};

    public static int minSplit(int amount) {
        if (amount <= 0) {
            throw new NotPositiveValueException("Amount cannot be less than or equal to zero.");
        }

        int coinsCount = 0;

        for (int coin : COINS) {
            while (amount >= coin) {
                coinsCount ++;
                amount -= coin;
            }
        }

        return coinsCount;
    }
}
