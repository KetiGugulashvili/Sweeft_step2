import sweeft.acceleration.task.*;

public class Main {
    public static void main(String[] args) {
//        Task 1
        int singleNumber = SingleNumberFounder.singleNumber(new int[]{1, 2, 3, 6, 3, 1, 2});
        System.out.println(singleNumber);

//        Task 2
        int minSplit = MoneyExchange.minSplit(33);
        System.out.println(minSplit);

//        Task 3
        int number = NaturalNumbers.notContains(new int[]{-3, 6, -4, 3, 2, 1});
        System.out.println(number);

//        Task 4
        String binarySum = BinaryString.sum("1010", "1011");
        System.out.println(binarySum);

//        Task 5
        int variants = Stair.countVariants(4);
        int variantsRecursion = Stair.countVariantsRecursion(4);
        System.out.println(variants);
        System.out.println(variantsRecursion);

//        Task 6
        DataStructure<Integer> data = new DataStructure<>();
        data.add(1);
        data.add(2);
        data.add(3);
        System.out.println(data);
        data.remove(2);
        System.out.println(data);
    }
}