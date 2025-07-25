public class sum {
    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        return add(a + 1, b - 1); // recursively add 1 to a, and subtract 1 from b
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        int result = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
