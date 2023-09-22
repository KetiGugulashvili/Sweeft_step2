package sweeft.acceleration.task;

import sweeft.acceleration.task.exception.EmptyArrayException;

import java.util.Arrays;

public class NaturalNumbers {
    public static int notContains(int[] array) {
        if (array.length == 0) {
            throw new EmptyArrayException();
        }

        Arrays.sort(array);

        int missingNumber = 1;

        for (int num : array) {
            if (num == missingNumber) {
                missingNumber++;
            } else if (num > missingNumber) {
                return missingNumber;
            }
        }

        return missingNumber;
    }
}
