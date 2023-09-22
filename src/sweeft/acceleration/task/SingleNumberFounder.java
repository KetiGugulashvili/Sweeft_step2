package sweeft.acceleration.task;

import sweeft.acceleration.task.exception.EmptyArrayException;
import sweeft.acceleration.task.exception.NotSingleNumberException;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleNumberFounder {
    public static int singleNumber(int[] nums) {
        if (nums.length == 0) {
            throw new EmptyArrayException();
        }

//        Counting how many times each number is repeated
        Map<Integer, Integer> countMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.summingInt(e -> 1)));

//        Checking which number/numbers aren't repeated
        List<Integer> uniqueNumbers = countMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (uniqueNumbers.size() > 1) {
            throw new NotSingleNumberException("More than one number does not repeat in the sequence.");
        } else if (uniqueNumbers.isEmpty()) {
            throw new NotSingleNumberException("All numbers in the sequence are repeated.");
        }

        return uniqueNumbers.get(0);
    }
}
