public class multi {
    public static int multiply(int a, int b) {
        // Base case
        if (b == 0) return 0;

        // If b is negative, convert to positive and flip the result
        if (b < 0) return -multiply(a, -b);

        // Recursive case
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 3));    // 15
        System.out.println(multiply(-4, 3));   // -12
        System.out.println(multiply(6, -2));   // -12
        System.out.println(multiply(-3, -3));  // 9
    }
}