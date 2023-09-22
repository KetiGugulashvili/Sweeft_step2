package sweeft.acceleration.task;

import sweeft.acceleration.task.exception.NotPositiveValueException;

public class Stair {
    public static int countVariants(int stairsCount) {
        if (stairsCount <= 0) {
            throw new NotPositiveValueException("There should be at least 1 step.");
        } else if (stairsCount == 1) {
            return 1;
        }

//        Probability count is similar to fibonacci sequence
        int[] variants = new int[stairsCount + 1];
        variants[0] = 1;
        variants[1] = 1;

        for (int i = 2; i <= stairsCount; i++) {
            variants[i] = variants[i - 1] + variants[i - 2];
        }

        return variants[stairsCount];
    }

    public static int countVariantsRecursion(int stairsCount) {
        if (stairsCount < 0) {
            throw new NotPositiveValueException("There should be at least 1 step.");
        } else if (stairsCount <= 1) {
            return 1;
        }

        return countVariantsRecursion(stairsCount - 1) + countVariantsRecursion(stairsCount - 2);
    }
}
