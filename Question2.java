public class Question2 {
    public static void main(String[] args) {
        // Integer types, ordered from smallest to largest range
        byte myByte = 100;
        short myShort = 20000;
        int myInt = 350000;
        long myLong = 9000000000L; // The L suffix is required because this value exceeds the range of an int

        // Floating-point types
        float myFloat = 3.14f;     // The f suffix is required, otherwise Java treats the literal as a double
        double myDouble = 3.14159265;

        // A single character
        char myChar = 'J';

        // A true or false value
        boolean myBoolean = true;

        // Print each value on its own line, labelled with its type
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
    }
}