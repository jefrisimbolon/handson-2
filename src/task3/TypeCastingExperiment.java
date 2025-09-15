package task3;

public class TypeCastingExperiment {
    public static void main(String[] args) {
        System.out.println("=== EKSPERIMEN TYPE CASTING ===");

        // 1. Implicit Casting (Widening)
        int intValue = 100;
        long longValue = intValue; // Automatic conversion
        double doubleValue = longValue; // Automatic conversion

        System.out.println("Implicit Casting:");
        System.out.println("int: " + intValue + " -> long: " + longValue + " -> double: " + doubleValue);

        // 2. Explicit Casting (Narrowing) - Tanpa Data Loss
        double preciseValue = 123.0;
        int convertedInt = (int) preciseValue;

        System.out.println("\nExplicit Casting (no data loss):");
        System.out.println("double: " + preciseValue + " -> int: " + convertedInt);

        // 3. Explicit Casting - Dengan Data Loss
        double decimalValue = 123.789;
        int truncatedInt = (int) decimalValue;

        System.out.println("\nExplicit Casting (with data loss):");
        System.out.println("double: " + decimalValue + " -> int: " + truncatedInt);

        // 4. Overflow Example
        int largeInt = 300;
        byte overflowByte = (byte) largeInt;

        System.out.println("\nOverflow Example:");
        System.out.println("int: " + largeInt + " -> byte: " + overflowByte);

        // 5. Convert long ke int dengan nilai besar
        long bigLong = 2147483648L; // lebih besar dari Integer.MAX_VALUE
        int longToInt = (int) bigLong;

        System.out.println("\nConvert long ke int (data loss):");
        System.out.println("long: " + bigLong + " -> int: " + longToInt);

        // 6. Convert float ke int
        float floatValue = 123.456f;
        int floatToInt = (int) floatValue;

        System.out.println("\nConvert float ke int (truncated):");
        System.out.println("float: " + floatValue + " -> int: " + floatToInt);

        // 7. Convert double ke float
        double bigDouble = 1.234567890123456789;
        float doubleToFloat = (float) bigDouble;

        System.out.println("\nConvert double ke float (precision loss):");
        System.out.println("double: " + bigDouble + " -> float: " + doubleToFloat);
    }
}

