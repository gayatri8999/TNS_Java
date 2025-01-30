package demo3;

public class PrimitiveData {
    public static void main(String[] args) {
        // 1 byte
        byte byteMax = 127;  // Max value within range
        byte byteMin = -128; // Min value within range

        System.out.println(byteMax);
        System.out.println(byteMin);

        // 2 byte
        short shortMax = 32767;   // Max value within range
        short shortMin = -32768; // Min value within range

        System.out.println(shortMax);
        System.out.println(shortMin);

        // int - 4 byte
        int intMax = 2147483647;   // Max value within range
        int intMin = -2147483648; // Min value within range

        System.out.println(intMax);
        System.out.println(intMin);

        // long - 8 byte
        long longMax = 9223372036854775807L;   // Max value within range
        long longMin = -9223372036854775808L; // Min value within range

        System.out.println(longMax);
        System.out.println(longMin);
    }
}
