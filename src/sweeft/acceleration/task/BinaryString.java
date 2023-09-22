package sweeft.acceleration.task;

public class BinaryString {
    public static String sum(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);

        return Integer.toBinaryString(intA + intB);
    }
}
